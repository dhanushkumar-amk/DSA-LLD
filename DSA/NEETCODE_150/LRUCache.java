package DSA.NEETCODE_150;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        deleteNode(node);
        insertAfterHead(node);

        return node.value;
    }

    public void put(int key, int value) {

        // Key already exists
        if (map.containsKey(key)) {

            Node node = map.get(key);
            node.value = value;

            deleteNode(node);
            insertAfterHead(node);
        }

        // New key
        else {

            // Cache is full
            if (map.size() == capacity) {

                Node lru = tail.prev;

                deleteNode(lru);
                map.remove(lru.key);
            }

            Node newNode = new Node(key, value);

            insertAfterHead(newNode);
            map.put(key, newNode);
        }
    }

    // Remove node from linked list
    private void deleteNode(Node node) {

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Insert node just after head
    private void insertAfterHead(Node node) {

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    // Doubly Linked List Node
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

    // Driver Code
    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        System.out.println(cache.get(1)); // 1

        cache.put(3, 3); // Evicts key 2

        System.out.println(cache.get(2)); // -1

        cache.put(4, 4); // Evicts key 1

        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 3
        System.out.println(cache.get(4)); // 4
    }
}