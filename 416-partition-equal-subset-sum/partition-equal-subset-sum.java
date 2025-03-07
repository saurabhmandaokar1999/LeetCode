class Solution {
    public boolean canPartition(int[] nums) {
        int sum =0,len=0;
        for(int i :nums){
            len++;
            sum+=i;
        }
        if(sum%2!=0){return false;}
        int[][] dp = new int[len][(sum/2)+1];
        for(int[] temp: dp){
            Arrays.fill(temp,-1);
        }
        return helper(nums,sum/2,dp,len-1);
    }
    public boolean helper(int [] nums,int target,int[][] dp,int idx){
    if(target==0)return true;
    if(idx==0){
        return nums[0]==target;
    }
    if(dp[idx][target]!=-1) return dp[idx][target]==1;

    boolean np = helper(nums,target,dp,idx-1);
    boolean p=false;
    if(nums[idx]<=target){
        p=helper(nums,target-nums[idx],dp,idx-1);
    }
    dp[idx][target]= np||p ? 1:0;
    return p||np;
    }
}