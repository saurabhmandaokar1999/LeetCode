class Solution {
    public int missingNumber(int[] nums) {
        int sum1=nums.length,sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1+=i;
            sum2+=nums[i];
        }
        int diff = sum1-sum2;
        return diff;
    }
}