class Solution {
    public long maximumProfit(int[] prices, int k) {
        int len = prices.length;
        Long[][][] dp = new Long[len][3][k+1];
        return helper(0,0,k,prices,len,dp);
    }
    public long helper(int idx, int state, int k, int[] prices, int len,Long[][][] dp){
        if(idx == len){
            if(state == 0 && k >=0) return 0;
            else return Integer.MIN_VALUE;
        }
        if(dp[idx][state][k] != null) return dp[idx][state][k];
        long pick = Integer.MIN_VALUE, notPick = Integer.MIN_VALUE;
        if(k > 0){
            if(state == 2) pick = -prices[idx] + helper(idx+1, 0, k-1, prices, len,dp);
            else if(state == 1) pick = prices[idx] + helper(idx+1, 0, k-1, prices, len,dp);
            else pick = Math.max(prices[idx] + helper(idx+1, 2, k, prices, len,dp), -prices[idx] + helper(idx+1, 1, k, prices, len,dp));
        }
        notPick = helper(idx+1, state, k, prices, len,dp);
        
        return dp[idx][state][k] = Math.max(pick, notPick);
    }
}