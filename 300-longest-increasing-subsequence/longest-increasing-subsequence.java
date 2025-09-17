class Solution {
    public int lengthOfLIS(int[] nums) {
        Integer[][] dp = new Integer[nums.length+1][nums.length+1];
        return helper(nums,-1,0,nums.length,dp);
    }
    public int helper(int [] nums, int prev,int idx,int len,Integer[][] dp){
        if(idx==len){
            return 0;
        }
        if(dp[prev+1][idx+1]!=null) return dp[prev+1][idx+1];
        int take=0;
        if(prev==-1 || nums[idx]>nums[prev]){
            take=1+helper(nums,idx,idx+1,len,dp);
        }
        int notTake=helper(nums,prev,idx+1,len,dp);

        return dp[prev+1][idx+1]= Math.max(take,notTake); 
    }
} 