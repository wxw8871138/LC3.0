package v2;

import java.util.HashMap;

public class LRUCache {
    class DLinkedNode {
        int key;
        int val;
        DLinkedNode pre;
        DLinkedNode next;

        DLinkedNode() {

        }
    }
    DLinkedNode head;
    DLinkedNode tail;
    int size;
    int capacity;
    HashMap<Integer, DLinkedNode> map;
    LRUCache(int capacity) {
        map = new HashMap<>();
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.pre = head;
        size = 0;
        this.capacity = capacity;
    }

    int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        } else {
            DLinkedNode node = map.get(key);
            moveToHead(node);
            return node.val;
        }
    }

    void put(int key, int value) {
        DLinkedNode node = map.get(key);
        if (node!=null) {
            node.val = value;
            moveToHead(node);
        } else {
            node = new DLinkedNode();
            node.key = key;
            node.val = value;
            addToHead(node);
            map.put(key, node);
            size++;
            if (size > capacity) {
                DLinkedNode nodeToRemove = tail.pre;
                removeNode(nodeToRemove);
                map.remove(nodeToRemove.key);
                size--;
            }
        }
    }
    public void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }


    public void removeNode(DLinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void addToHead(DLinkedNode node) {
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
        node.pre = head;
    }
}
