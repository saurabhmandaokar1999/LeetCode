class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int maxWidth = triangle.get(triangle.size()-1).size();
        Integer[][] dp = new Integer[len][maxWidth];
        return helper(triangle,0,0,len,dp);   
    }
    public int helper(List<List<Integer>> triangle,int row,int col,int len, Integer[][] dp){
        if(row==len-1){
            return triangle.get(row).get(col);
        }
        if(dp[row][col]!=null) return dp[row][col];
        int down = triangle.get(row).get(col)+helper(triangle,row+1,col,len,dp);
        int right=Integer.MAX_VALUE;
        if(col+1<=triangle.get(row).size()){
            right = triangle.get(row).get(col)+helper(triangle,row+1,col+1,len,dp);
        }
        return dp[row][col]=Math.min(down,right);
    }
}