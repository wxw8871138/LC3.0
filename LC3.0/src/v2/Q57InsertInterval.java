package v2;

import java.util.Arrays;

public class Q57InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals
        ) {
            if (idx == -1 || interval[0] > res[idx][1]) {
                idx++;
                res[++idx] = interval;
        }
    }
}
