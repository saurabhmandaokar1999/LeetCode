class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp,-1);
        return helper(nums,len-1,dp);
    }
    public int helper(int[] nums, int n,int[] dp){
        if(n<0) return 0;
        if(n==0) return nums[0];
       if(dp[n]!=-1) return dp[n];
        int p=nums[n]+helper(nums,n-2,dp);
        int np=helper(nums,n-1,dp);
        
        return dp[n]=Math.max(p,np);
    }
}