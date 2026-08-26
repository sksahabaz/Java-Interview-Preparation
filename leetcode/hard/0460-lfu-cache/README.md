# LFU Cache

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Design and implement a data structure for a Least Frequently Used (LFU) cache.

Implement the `LFUCache` class:

- LFUCache(int capacity) Initializes the object with the capacity of the data structure.
- int get(int key) Gets the value of the key if the key exists in the cache. Otherwise, returns -1.
- void put(int key, int value) Update the value of the key if present, or inserts the key if not already present. When the cache reaches its capacity, it should invalidate and remove the least frequently used key before inserting a new item. For this problem, when there is a tie (i.e., two or more keys with the same frequency), the least recently used key would be invalidated.

To determine the least frequently used key, a  **use counter**  is maintained for each key in the cache. The key with the smallest  **use counter**  is the least frequently used key.

When a key is first inserted into the cache, its  **use counter**  is set to `1` (due to the `put` operation). The  **use counter**  for a key in the cache is incremented either a `get` or `put` operation is called on it.

The functions `get` and `put` must each run in `O(1)` average time complexity.

 

 **Example 1:** 

```
Input
["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, 3, null, -1, 3, 4]

Explanation
// cnt(x) = the use counter for key x
// cache=[] will show the last used order for tiebreakers (leftmost element is  most recent)
LFUCache lfu = new LFUCache(2);
lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
lfu.get(1);      // return 1
                 // cache=[1,2], cnt(2)=1, cnt(1)=2
lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
                 // cache=[3,1], cnt(3)=1, cnt(1)=2
lfu.get(2);      // return -1 (not found)
lfu.get(3);      // return 3
                 // cache=[3,1], cnt(3)=2, cnt(1)=2
lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
                 // cache=[4,3], cnt(4)=1, cnt(3)=2
lfu.get(1);      // return -1 (not found)
lfu.get(3);      // return 3
                 // cache=[3,4], cnt(4)=1, cnt(3)=3
lfu.get(4);      // return 4
                 // cache=[4,3], cnt(4)=2, cnt(3)=3

```

 

 **Constraints:** 

- 1 <= capacity <= 104
- 0 <= key <= 105
- 0 <= value <= 109
- At most 2 * 105 calls will be made to get and put.

## Solution

**Language:** Java  
**Runtime:** 60 ms (beats 47.37%)  
**Memory:** 137.7 MB (beats 33.20%)  
**Submitted:** 2026-08-26T11:58:31.538Z  

```java
import java.util.*;

class LFUCache {

    class Node {
        int key;
        int value;
        int frequency;

        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.frequency = 1;
        }
    }

    class DoublyLinkedList {

        Node head;
        Node tail;
        int size;

        DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);

            head.next = tail;
            tail.prev = head;

            size = 0;
        }

        // Add node as most recently used
        void addFirst(Node node) {

            Node first = head.next;

            node.next = first;
            node.prev = head;

            head.next = node;
            first.prev = node;

            size++;
        }

        // Remove a node
        void remove(Node node) {

            Node previous = node.prev;
            Node next = node.next;

            previous.next = next;
            next.prev = previous;

            size--;
        }

        // Remove least recently used node
        Node removeLast() {

            if (size == 0) {
                return null;
            }

            Node node = tail.prev;

            remove(node);

            return node;
        }
    }

    int capacity;
    int minFrequency;

    // key → Node
    HashMap<Integer, Node> keyMap;

    // frequency → linked list of nodes
    HashMap<Integer, DoublyLinkedList> frequencyMap;

    public LFUCache(int capacity) {

        this.capacity = capacity;

        minFrequency = 0;

        keyMap = new HashMap<>();
        frequencyMap = new HashMap<>();
    }

    public int get(int key) {

        // Key does not exist.
        if (!keyMap.containsKey(key)) {
            return -1;
        }

        Node node = keyMap.get(key);

        // Increase frequency.
        increaseFrequency(node);

        return node.value;
    }

    public void put(int key, int value) {

        // If capacity is 0, nothing can be stored.
        if (capacity == 0) {
            return;
        }

        // Key already exists.
        if (keyMap.containsKey(key)) {

            Node node = keyMap.get(key);

            // Update value.
            node.value = value;

            // put() counts as a use.
            increaseFrequency(node);

            return;
        }

        // Cache is full.
        if (keyMap.size() == capacity) {

            // Get the least recently used node
            // from the minimum-frequency list.
            DoublyLinkedList list = frequencyMap.get(minFrequency);

            Node lru = list.removeLast();

            keyMap.remove(lru.key);
        }

        // Create new node.
        Node newNode = new Node(key, value);

        keyMap.put(key, newNode);

        // New node has frequency 1.
        frequencyMap
            .computeIfAbsent(1, k -> new DoublyLinkedList())
            .addFirst(newNode);

        // New node's frequency is 1.
        minFrequency = 1;
    }

    private void increaseFrequency(Node node) {

        int oldFrequency = node.frequency;

        DoublyLinkedList oldList =
            frequencyMap.get(oldFrequency);

        // Remove from old frequency list.
        oldList.remove(node);

        // If this was the minimum-frequency list
        // and it became empty, increase minFrequency.
        if (oldFrequency == minFrequency &&
            oldList.size == 0) {

            minFrequency++;
        }

        // Increase node's frequency.
        node.frequency++;

        // Get/create new frequency list.
        DoublyLinkedList newList =
            frequencyMap.computeIfAbsent(
                node.frequency,
                k -> new DoublyLinkedList()
            );

        // Most recently used within this frequency.
        newList.addFirst(node);
    }
}
/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
```

---

[View on LeetCode](https://leetcode.com/problems/lfu-cache/)