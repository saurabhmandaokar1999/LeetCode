class Solution {
    public int uniquePathsWithObstacles(int[][] oG) {
        int r = oG.length;
        int c = oG[0].length;
        int[][] dp = new int[r][c];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return helper(r-1,c-1,oG,dp);
    }
    public int helper(int r, int c,int[][]oG,int[][]dp){
        if(r==0 && c==0 && oG[r][c]!=1){
            return 1;
        }
        if(r<0 || c<0 || oG[r][c]==1){
            return 0;
        }
        if(dp[r][c]!=-1) return dp[r][c];

        int up = helper(r-1,c,oG,dp);
        int left = helper(r,c-1,oG,dp);
        return dp[r][c] = up+left;
    }
}