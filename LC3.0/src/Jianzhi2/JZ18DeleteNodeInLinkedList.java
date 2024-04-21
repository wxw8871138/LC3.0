package Jianzhi2;

public class JZ18DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
