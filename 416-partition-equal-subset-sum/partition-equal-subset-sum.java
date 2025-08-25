class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int len=0;
        //find total sum
        for(int i:nums){
            sum+=i;
            len++;
        }
       int dp[][]=new int[len][sum+1];
       for(int[] a: dp){
        Arrays.fill(a,-1);
       }
        return helper(nums,0,sum,len-1,dp);
    }
    public boolean helper(int[] nums,int currSum,int sum,int idx,int[][] dp){
        if(currSum*2==sum) return true;
        if(idx==0){
            return (nums[0]+currSum)*2==sum;
        }
        if(dp[idx][currSum]!=-1) return dp[idx][currSum]==1;
        boolean p = helper(nums,currSum+nums[idx],sum,idx-1,dp);
        boolean np = helper(nums,currSum,sum,idx-1,dp);
        dp[idx][currSum]=p||np?1:0;
        return p||np;
    }
}