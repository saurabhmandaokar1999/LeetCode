class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len==1) return nums[0];
        int[] dp = new int[len];
        Arrays.fill(dp,-1);
        int p = helper(nums,len-1,1,dp);
         Arrays.fill(dp,-1);
        int np = helper(nums,len-2,0,dp);
        return Math.max(p,np);
    }
    public int helper(int[] nums,int n,int e,int[] dp){
        if(n<e) return 0;
        if(n==e) return nums[e];
        if(dp[n]!=-1) return dp[n];
        int p=nums[n]+helper(nums,n-2,e,dp);
        int np=helper(nums,n-1,e,dp);
        return dp[n]=Math.max(p,np);
    } 
}