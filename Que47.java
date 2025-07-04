public class Que47 {
    // Count islands (DFS on matrix)
    public static void dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
            return;
        }
        // Mark the current cell as visited
        grid[i][j] = -1;
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }

    public static int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int islandCount = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    islandCount++;
                    dfs(grid, i, j); // Mark the whole island
                }
            }
        }
        return islandCount;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 1 }
        };
        System.out.println("Number of Islands: " + numIslands(grid));
    }
}
