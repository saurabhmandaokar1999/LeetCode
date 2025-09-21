class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        int maxi = 1;
        Arrays.fill(dp,1);
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(1+dp[j],dp[i]);
                }
            }
            maxi = Math.max(dp[i],maxi);
        }
        return maxi;
    }
}