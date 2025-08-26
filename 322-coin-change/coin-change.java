class Solution {
    public static final int max = 10001;
    public int coinChange(int[] coins, int amount) {
        int len = coins.length;
        int[][] dp=new int[len][amount+1];
        for(int[] d: dp){
            Arrays.fill(d,-1);
        } 
        int ans = helper(coins,amount,len-1,dp);
        return ans>=max? -1:ans;
    }
    public int helper(int[] coins,int amount,int idx,int[][] dp){
        if(amount==0) return 0;
        if(idx==0){
            return amount%coins[idx]==0 ? amount/coins[idx]:max;
        }
        if(dp[idx][amount]!=-1) return dp[idx][amount];
        int p = max;
        if(amount>=coins[idx]){
            p=1+helper(coins,amount-coins[idx],idx,dp);
        }        
        int np = helper(coins,amount,idx-1,dp);
        dp[idx][amount] = Math.min(p,np);
        return dp[idx][amount];
    }
}