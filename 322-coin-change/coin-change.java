class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        int ans= helper(coins,amount,coins.length-1,dp);
        if(ans>=100000){
            return -1;
        }
        return ans;
    }
    public int helper(int coins[] , int tar,int idx,int[][] dp){
        if(tar==0) return 0;
        if(idx==0){
            if(tar%coins[idx]==0) return tar/coins[idx];
            else return 100000;
        }
        if(dp[idx][tar]!=-1) return dp[idx][tar];  
        int np = helper(coins, tar,idx-1,dp);
        int p = 100000;
        if(coins[idx]<=tar){
            p=1+helper(coins,tar-coins[idx],idx,dp);
        }
        return dp[idx][tar]=Math.min(p,np);
    }
}  