package v2;

public class Q63uniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int height = obstacleGrid.length;
        int length = obstacleGrid[0].length;
        int[][] dp = new int[height][length];
        for (int i = 0; i < height; i++) {
            if (obstacleGrid[i][0] != 1) {
                dp[i][0] = 1;
            } else {
                dp[i][0] = 0;
                break;
            }
        }
        for (int i = 0; i < length; i++) {
            if (obstacleGrid[0][i] != 1) {
                dp[0][i] = 1;
            } else {
                dp[0][i] = 0;
                break;
            }
        }
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j]+dp[i][j-1];
                }

            }
        }
        return dp[height - 1][length - 1];

    }
}
