class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max=nums[0];
        int curr=0;
        for(int j =0;j<len;j++){
        curr+=nums[j];
        if(curr>max) max = curr;
        if(curr<0) curr=0;
      }
      return max;
    }
}