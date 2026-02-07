class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len ==1) return nums[0];
        if(len < 3) return Math.max(nums[0],nums[1]);
        Integer[] dp = new Integer[len];
        int idx = len-1;
        int l = nums[idx] + helper(idx-2,1,nums,dp);
        dp =  new Integer[len];
        int f = helper(idx-1,0, nums,dp);
        return Math.max(l,f);                  
    }
    private int helper(int idx,int end,int[] nums,Integer [] dp){
        if(idx == end) return nums[end];
        if(idx < end) return 0;
        if(dp[idx] != null) return dp[idx];
        int p = nums[idx]+ helper(idx-2,end, nums,dp);
        int np = helper(idx-1,end,nums,dp);
        return dp[idx]=Math.max(p,np);
    }
}