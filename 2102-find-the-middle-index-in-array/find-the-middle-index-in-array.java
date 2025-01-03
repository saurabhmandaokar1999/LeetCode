class Solution {
    public int findMiddleIndex(int[] nums) {
        long left= 0;
        long right= 0;
        for(int num:nums){
            right+=num;
        }
        for(int i =0;i<nums.length;i++){
            //remove element and check for equality 
            right-=nums[i];
            if(right == left){
                return i;
            }
            //if not equal then add in the left side.
            left+=nums[i];
        }
        return -1;
    }
}