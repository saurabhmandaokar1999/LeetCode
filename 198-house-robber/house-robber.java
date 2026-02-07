class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        Integer[] dp = new Integer[len]; 
        return helper(len-1, nums, dp);
    }
    private int helper(int idx, int[] nums, Integer[] dp){
        if(idx < 0) return 0;
        if(dp[idx] != null) return dp[idx];
        int p = nums[idx] + helper(idx-2,nums, dp);
        int np = helper(idx-1,nums,dp);
        return dp[idx] = Math.max(p,np);
    }
}