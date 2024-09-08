class Solution {
    public int removeDuplicates(int[] nums) {
        int p=0;
        int q=0;
        while(q<nums.length){
            if(nums[p]!=nums[q]){
                nums[p+1] = nums[q];
                p++;
            }else if(nums[p]==nums[q]){
                q++;
            }
        }
        return p+1;
    }
}