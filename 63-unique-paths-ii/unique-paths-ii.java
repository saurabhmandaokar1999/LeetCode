class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r= obstacleGrid.length;
        int c=obstacleGrid[0].length;

        int[][] dp = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(obstacleGrid[i][j]==1){ dp[i][j]=0 ; continue;}
                if(i==0 && j==0){ dp[i][j]=1; continue;}
                int down= 0,right=0;
                if(i>0){down = dp[i-1][j];}
                if(j>0){right= dp[i][j-1];}
             
                dp[i][j]=down+right;
            }
        }
        return dp[r-1][c-1];
    }
}