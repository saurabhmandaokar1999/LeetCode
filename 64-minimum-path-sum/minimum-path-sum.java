class Solution {
    public int minPathSum(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] dp = new int[row][col];
        dp[0][0]=grid[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0){
                    if(j>0) dp[0][j]=grid[i][j]+dp[0][j-1];
                }
                if(j==0){
                    if(i>0) dp[i][0]=grid[i][j]+dp[i-1][0];
                }
                if(i>0 && j>0){
                    int d=grid[i][j]+dp[i-1][j];
                    int r=grid[i][j]+dp[i][j-1];
                    dp[i][j]=Math.min(d,r);
                }    
            }
        }
        return dp[row-1][col-1];
    }
}