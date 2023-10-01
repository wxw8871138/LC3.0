package jianzhi;

import java.util.PriorityQueue;

public class Q40GetLeastKNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2) -> i2 - i1);
        for (int i = 0; i < arr.length; i++) {
            if (pq.size() < k) {
                pq.add(arr[i]);
            } else if (pq.peek() > arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        int[] res = new int[k];
        int idx = 0;
        for (Integer num : pq
        ) {
            res[idx++] = num;
        }
        return res;
    }
}
