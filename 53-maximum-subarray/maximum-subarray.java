class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int ans = nums[0];
        int len = nums.length;
        for(int i = 1; i< len ;i++){
            sum += nums[i];
            if(sum < nums[i]){
                sum = nums[i];
            }
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}