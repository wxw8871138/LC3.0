package jianzhi;

public class Q47maxValue {
    public int maxValue(int[][] grid) {
        int height = grid.length;
        int length = grid[0].length;
        int[][] dp = new int[height][length];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < height; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < length; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < length; j++) {
                dp[i][j] = grid[i][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[height - 1][length - 1];
    }
}

