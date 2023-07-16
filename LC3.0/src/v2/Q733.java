package v2;

public class Q733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int currColor) {
        if (sr < 0 || sc < 0 || sr > image.length - 1 || sc > image[0].length - 1 || currColor == color || image[sr][sc] != currColor) {
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr+1, sc, color, currColor);
        dfs(image, sr-1, sc, color, currColor);
        dfs(image, sr, sc+1, color, currColor);
        dfs(image, sr, sc-1, color, currColor);
    }

}
