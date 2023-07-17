package jianzhi;

import java.util.ArrayList;
import java.util.List;

public class reversePrint {
    List<Integer> list;
    public int[] reversePrint(ListNode head) {
        list = new ArrayList<>();
        reverse(head);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void reverse(ListNode head) {
        if (head == null) {
            return;
        }
        reverse(head.next);
        list.add(head.val);
    }
}
