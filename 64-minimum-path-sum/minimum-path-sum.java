class Solution {
    public int minPathSum(int[][] grid) {
        int i = grid.length;
        int j = grid[0].length;
        int[][] dp = new int [i][j];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return helper(i-1,j-1,grid,dp);
        
    }
    private int helper(int i, int j,int[][] grid,int[][] dp){
        if(i==0 && j==0){
            return grid[0][0];
        }
        if(i<0 || j<0){
            return 200*200;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int up = grid[i][j]+helper(i-1,j,grid,dp);
        int left = grid[i][j]+helper(i,j-1,grid,dp);

        return dp[i][j]=Math.min(up,left);
    }
}