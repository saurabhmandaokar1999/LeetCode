class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        //solving using Dynamic Programming
        return helper(n,dp);
    }
    public int helper(int n , int[] dp){
        if(n<=0) return 0;
        if(n==1) return 1;
        if(dp[n]!=0) return dp[n];
        return dp[n] = helper(n-1,dp)+helper(n-2,dp);
    }
}