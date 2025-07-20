class Solution {
    public int countIslands(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > 0) {
                    int sum = dfs(grid, i, j, rows, cols);
                    if (sum % k == 0) count++;
                }
            }
        }
        return count;
    }

    private int dfs(int[][] grid, int i, int j, int rows, int cols) {
        // 1) Check bounds and water
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == 0) {
            return 0;
        }
        // 2) “Sink” this cell and grab its value
        int curr = grid[i][j];
        grid[i][j] = 0;
        // 3) Explore 4‑directions
        return curr
             + dfs(grid, i + 1, j, rows, cols)
             + dfs(grid, i - 1, j, rows, cols)
             + dfs(grid, i, j + 1, rows, cols)
             + dfs(grid, i, j - 1, rows, cols);
    }
}
