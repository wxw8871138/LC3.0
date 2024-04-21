package Jianzhi2;

public class JZ18 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while(cur.next!=null&&cur.next.next!=null){
            if (cur.next.val == cur.next.next.val) {
                int value = cur.next.val;
                while (cur.next != null && cur.next.val == value) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
