public class Q733FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int color, int currColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != currColor || currColor == color) {
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr + 1, sc, color, currColor);
        dfs(image, sr - 1, sc, color, currColor);
        dfs(image, sr, sc + 1, color, currColor);
        dfs(image, sr, sc - 1, color, currColor);
    }



}
