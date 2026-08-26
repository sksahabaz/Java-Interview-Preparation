# LRU Cache

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Design a data structure that follows the constraints of a  **Least Recently Used (LRU) cache**.

Implement the `LRUCache` class:

- LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
- int get(int key) Return the value of the key if the key exists, otherwise return -1.
- void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.

The functions `get` and `put` must each run in `O(1)` average time complexity.

 

 **Example 1:** 

```
Input
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4

```

 

 **Constraints:** 

- 1 <= capacity <= 3000
- 0 <= key <= 104
- 0 <= value <= 105
- At most 2 * 105 calls will be made to get and put.

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 93.35%)  
**Memory:** 58.9 MB (beats 90.43%)  
**Submitted:** 2026-08-26T12:00:03.977Z  

```java
import java.util.*;

class LRUCache {

    class Node {

        int key;
        int value;

        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;

    HashMap<Integer, Node> map;

    Node head;
    Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;

        map = new HashMap<>();

        // Dummy nodes.
        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        // Key doesn't exist.
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        // This key was just used,
        // so move it to the MRU position.
        remove(node);
        addToFront(node);

        return node.value;
    }

    public void put(int key, int value) {

        // Key already exists.
        if (map.containsKey(key)) {

            Node node = map.get(key);

            // Update value.
            node.value = value;

            // Move to MRU position.
            remove(node);
            addToFront(node);

            return;
        }

        // Create a new node.
        Node newNode = new Node(key, value);

        // Put it into HashMap.
        map.put(key, newNode);

        // New node is most recently used.
        addToFront(newNode);

        // Cache exceeded capacity.
        if (map.size() > capacity) {

            // Least recently used node is
            // just before the dummy tail.
            Node lru = tail.prev;

            remove(lru);

            map.remove(lru.key);
        }
    }

    // Remove a node from the linked list.
    private void remove(Node node) {

        Node previous = node.prev;
        Node next = node.next;

        previous.next = next;
        next.prev = previous;
    }

    // Add a node immediately after head.
    // This position represents MRU.
    private void addToFront(Node node) {

        Node first = head.next;

        node.next = first;
        node.prev = head;

        head.next = node;
        first.prev = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
```

---

[View on LeetCode](https://leetcode.com/problems/lru-cache/)