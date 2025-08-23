class Solution {
    private static final int INF = 1_000_000_000;
    public int minFallingPathSum(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int ans=Integer.MAX_VALUE;
        int dp[][] = new int[row][col];
        for(int[] d:dp){
            Arrays.fill(d,Integer.MIN_VALUE);
        }
        for(int i=0;i<col;i++){
            ans=Math.min(ans,helper(0,i,matrix,row,col,dp));
        }
        return ans;
    }
    public int helper(int row,int col,int[][] matrix,int rowLen,int colLen,int[][] dp){
        if(col<0|| col>=colLen) return INF;
        if(row==rowLen-1) return matrix[row][col];
        if(dp[row][col]!=Integer.MIN_VALUE) return dp[row][col];
        int [] colPath = {-1,0,1};
        int path=Integer.MAX_VALUE;
        for(int c:colPath){
            if(col+c>=0 && col+c<=colLen){
                path=Math.min(path,matrix[row][col]+helper(row+1,col+c,matrix,rowLen,colLen,dp));
            }
        }
        return dp[row][col]=path;
    }

}