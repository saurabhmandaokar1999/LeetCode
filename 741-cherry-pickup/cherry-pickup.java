class Solution {
    public int cherryPickup(int[][] grid) {
        int r=grid.length;
        Integer dp[][][] = new Integer[r][r][r];
        int ans =  helper(grid,0,0,0,r-1,r-1,dp);
        return ans<0?0:ans;
    }
    public int helper(int[][] grid,int i1,int j1,int i2,int m,int n, Integer [][][] dp){
        int j2= i1+j1-i2;
        if(i1>m || i2>m || j1>n || j2>n ||  grid[i1][j1]==-1 || grid[i2][j2]==-1){
            return Integer.MIN_VALUE;
        }
        if(dp[i1][j1][i2]!=null) return dp[i1][j1][i2];
       if(i1==m && i2==m && j1==n && j2==n) return grid[i1][j1];
        int cherry=0;
        if(i1==i2 && j1==j2){
            cherry = grid[i1][j1];
        }else{
            cherry = grid[i1][j1]+grid[i2][j2];
        }
        int fr=helper(grid,i1+1,j1,i2+1,m,n,dp);
        int fd=helper(grid,i1,j1+1,i2,m,n,dp);
        int sr=helper(grid,i1+1,j1,i2,m,n,dp);
        int sd=helper(grid,i1,j1+1,i2+1,m,n,dp);
        int val = Math.max(Math.max(fr,fd),Math.max(sr,sd));
        if(val<0){
            return dp[i1][j1][i2]=Integer.MIN_VALUE;
        }else{
            return dp[i1][j1][i2]=cherry+val;
        }
    }
}