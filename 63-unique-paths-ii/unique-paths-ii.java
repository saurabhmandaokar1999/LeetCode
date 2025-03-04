class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r= obstacleGrid.length;
        int c=obstacleGrid[0].length;

        int[] prev = new int[c];

        for(int i=0;i<r;i++){
            int[] curr = new int[c];
            for(int j=0;j<c;j++){
                if(obstacleGrid[i][j]==1){ curr[j]=0 ; continue;}
                if(i==0 && j==0){ curr[j]=1; continue;}
                int down= 0,right=0;
                if(i>0){down = prev[j];}
                if(j>0){right= curr[j-1];}
                curr[j]=down+right;
            }
            prev=curr;
        }
        return prev[c-1];
    }
}