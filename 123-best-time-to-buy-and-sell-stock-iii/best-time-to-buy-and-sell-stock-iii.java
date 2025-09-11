class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][][] dp = new int[len][2][3];
        for(int[][] dd: dp){
            for(int[] d: dd){
                Arrays.fill(d,-1);
            }
        }
        return helper(prices,0,len,1,2,dp);
    }
    public int helper(int [] prices,int idx,int len, int buy, int cap,int [][][] dp){
        // base case
        if(idx==len || cap==0) return 0;
        if(dp[idx][buy][cap]!=-1) return dp[idx][buy][cap];
        if(buy==1){
            return dp[idx][buy][cap]=Math.max(-prices[idx]+helper(prices,idx+1,len,0,cap,dp),helper(prices,idx+1,len,1,cap,dp));
        }else{
            return dp[idx][buy][cap]=Math.max(prices[idx]+helper(prices,idx+1,len,1,cap-1,dp),helper(prices,idx+1,len,0,cap,dp));
        }
    }
}