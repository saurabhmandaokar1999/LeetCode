class Solution {
    public int maxSubArray(int[] nums) {
        //using kadane's algorithm
        int max=nums[0],curr=0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            if(max<curr){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        return max;
    }
}