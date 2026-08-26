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