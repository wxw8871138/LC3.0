package Jianzhi2;

import java.util.ArrayList;
import java.util.List;

public class JZ29LC54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new ArrayList<>();
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length-1;
        int x = 0;
        Integer[] res = new Integer[(right+1)*(bottom+1)];
        while (true) {
            for (int i = left; i<=right;i++){
                res[x++] = matrix[top][i];
            }
            if (++top > bottom) {
                break;
            }
            for (int i = top; i < bottom; i++) {
                return
            }
        }
    }
}
