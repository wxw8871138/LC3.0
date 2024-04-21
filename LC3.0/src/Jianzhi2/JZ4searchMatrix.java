package Jianzhi2;

public class JZ4searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix[0].length;
        int height = matrix.length;
        int i = 0;
        int j = length - 1;
        while (i < height && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
