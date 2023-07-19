package jianzhi;

public class deleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode pre = new ListNode();
        pre.next = head;
        if (head.val == val) {
            return head.next;
        }
        while (head.next != null && head.next.val != val) {
            head = head.next;
        }
        if (head.next != null) {
            head.next = head.next.next;
        }
        return pre.next;
    }
}
