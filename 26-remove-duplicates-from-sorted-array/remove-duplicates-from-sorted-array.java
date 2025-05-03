class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len<2) return len;
        int r=1;
        for(int i=1;i<len;i++){
            if(nums[i-1]!=nums[i]){
                nums[r++] = nums[i];
            }
        }
        return r;
    }
}