class Solution {
    public int cherryPickup(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        Integer[][][] dp = new Integer[c][c][r];
        return helper(0,c-1,0,r-1,c-1,grid,dp);
    }
    public int helper(int i1,int i2,int j,int r,int c, int[][] grid,Integer[][][] dp){
        //terminating condition for negative
        if(i1<0 || i1>c || i2<0 ||i2>c){
            return Integer.MIN_VALUE;
        }
    if(dp[i1][i2][j]!=null) return dp[i1][i2][j];
        //base case
        if(j==r) {
            if(i1==i2) return grid[j][i1];
            else return grid[j][i1]+grid[j][i2];
        }
        int val=0;
        if(i1==i2)val=grid[j][i1];
        else val=grid[j][i1]+grid[j][i2];
        int [] move = {-1,0,1};
        int max =0;
        for(int m:move){
            for(int n:move){
                int ans = helper(i1+m,i2+n,j+1,r,c,grid,dp);
                 max = Math.max(max,ans);
            }
        }
        return dp[i1][i2][j]=max+val;
    }
}