class Solution {
    private static final int INF = 1_000_000_000; 
    public int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];

        for(int i=0;i<col;i++){
            dp[0][i]=matrix[0][i];
        }
        int dif[] = {-1,0,1};
        for(int i=1;i<row;i++){
            for(int j=0;j<col;j++){
                int min=INF;
                for(int d:dif){
                if(j+d>=0 && j+d<col) min=Math.min(min,matrix[i][j]+dp[i-1][j+d]);
                }
                 dp[i][j]=min;
            }
        }
        int ans=INF;
        for(int i=0;i<col;i++){
            ans=Math.min(ans,dp[row-1][i]);
        }
        return ans;
    }
}