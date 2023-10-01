package v2;

public class Q221MaxSquare {
    public int maximalSquare(char[][] matrix) {
        int res = 0;
        int height = matrix.length;
        int length = matrix[0].length;
        if (matrix == null || height == 0 || length == 0) {
            return res;
        }
        int[][] dp = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]), dp[i][j - 1]) + 1;
                    }
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res*res;
    }
}
