class Solution {
    public static final int mod = 1000000007;
    public int numberOfPaths(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        Integer[][][] dp = new Integer[row][col][k];
        return helper(grid, k, row-1, col-1, 0, dp);
    }
    public int helper(int [][] grid , int k, int r, int c, int total, Integer[][][] dp){
        if(r < 0 || c <0 ) return 0;
        total+=grid[r][c];
        total %= k;
        if(r == 0 && c == 0){
            if(total % k == 0) return 1;
            else return 0;
        }
        if(dp[r][c][total] != null) return dp[r][c][total];
        int up = helper(grid, k, r-1, c,total, dp);
        int rig = helper(grid, k, r, c-1, total, dp);
        return dp[r][c][total] = (rig+up) % mod;
    }
}