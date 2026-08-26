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