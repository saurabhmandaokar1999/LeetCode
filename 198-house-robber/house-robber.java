class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp,-1);
        return helper(nums,len-1,dp);
    }
    public int helper(int[] nums,int idx,int[] dp){
        if(idx==0) return nums[idx];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int p = helper(nums,idx-2,dp)+nums[idx];
        int np = helper(nums,idx-1,dp);
        return dp[idx]=Math.max(p,np);
    }
} 