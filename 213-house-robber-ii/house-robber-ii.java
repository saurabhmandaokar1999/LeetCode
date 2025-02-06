class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len==1) return nums[len-1];
        int[] dp = new int[len];
        Arrays.fill(dp,-1);
        //picking last-idx or not picking last-idx
        int p=helper(nums,len-1,1,dp);
        Arrays.fill(dp,-1);
        int np=helper(nums,len-2,0,dp);
        return Math.max(p,np);
    }
    public int helper(int[] nums,int end,int start,int[]dp){
    if(start>end) return 0;
    
    if(dp[end]!=-1)return dp[end];
    
    int p=nums[end]+helper(nums,end-2,start,dp);

    int np=helper(nums,end-1,start,dp);

    return dp[end] = Math.max(p,np);
    } 
}