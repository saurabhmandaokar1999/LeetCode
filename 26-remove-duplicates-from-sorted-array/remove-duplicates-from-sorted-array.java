class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = 0;
        int len = nums.length;
        for(int i = 1 ;i< len ; i++){
            if(nums[curr] != nums[i]){
                curr++;
                nums[curr] = nums[i];
            }
        }
        return curr+1;
    }
}