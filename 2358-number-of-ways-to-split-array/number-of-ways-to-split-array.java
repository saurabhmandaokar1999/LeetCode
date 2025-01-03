class Solution {
    public int waysToSplitArray(int[] nums) {
         long left = nums[0];
         long right =0;
         int len = nums.length;
         int count = 0;

         for(int i =1;i<len;i++){
            right+=nums[i];
         }
         for(int i=1;i<len;i++){
            if(left>=right){
                count++;
            }
            left+=nums[i];
            right-=nums[i];
         }
         return count;
    }
}