class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int min = 100*200;
        Integer [][] dp = new Integer[n][n];
        for(int i=0;i<n;i++){
            min = Math.min(min,grid[0][i]+helper(grid,i,1,n,dp));
        }
        return min;
    }
    public int helper(int[][] grid , int lastIndex, int row ,int n,Integer [][] dp){
        if(row == n){
            return 0;
        }
        if(dp[row][lastIndex]!=null) return dp[row][lastIndex];
        int min = 100*200;
        for(int i=0;i<n;i++){
            if(i!=lastIndex){
                min = Math.min(min,grid[row][i]+helper(grid,i,row+1,n,dp));
            }
        }
        return dp[row][lastIndex]=min;
    }
}