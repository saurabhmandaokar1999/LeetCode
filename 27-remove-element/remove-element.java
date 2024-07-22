class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0;
        for(int n : nums){
            if(val!=n){
                nums[i++]=n;
            }
        }
        return i;
    }
}