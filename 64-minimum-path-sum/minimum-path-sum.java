class Solution {
    public int minPathSum(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] dp = new int[row][col];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return helper(row-1,col-1,grid,dp);
    }
    public int helper(int row,int col,int[][] grid,int[][] dp){
        if(row<0 || col<0) return 200*200;
        if(row==0 && col==0) return grid[0][0];
        if(dp[row][col]!=-1) return dp[row][col];
         int u=grid[row][col]+helper(row-1,col,grid,dp);
         int l=grid[row][col]+helper(row,col-1,grid,dp);
         return dp[row][col]=Math.min(u,l);
    }
}