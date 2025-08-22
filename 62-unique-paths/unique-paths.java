class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] d : dp){
            Arrays.fill(d,-1);
        }
        return helper(m-1,n-1,dp);
    }

    public int helper(int row,int col,int[][] dp){
        //Write base condition
        if(row<0 || col<0) return 0;
        if(row==0 && col==0) return 1;
        if(dp[row][col]!=-1) return dp[row][col];
        int u =helper(row-1,col,dp);
        int l =helper(row,col-1,dp);
        return dp[row][col]=u+l;
    }
}