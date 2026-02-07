class Solution {
    public int maximumPoints(int mat[][]) {
        // code here
        int r = mat.length;

        Integer[][] dp = new Integer[r][4];
        return helper(r-1,3,mat,dp);
    }
    private int helper(int n, int l, int[][] mat,Integer[][] dp){
        if(n<0) return 0;
        if(dp[n][l]!= null) return dp[n][l];
        int max = -1;
        for(int i = 0; i<3;i++){
            if(i!= l){
                max = Math.max(max,mat[n][i]+helper(n-1,i,mat,dp));
            }
        }
        return dp[n][l]=max;
    }
}