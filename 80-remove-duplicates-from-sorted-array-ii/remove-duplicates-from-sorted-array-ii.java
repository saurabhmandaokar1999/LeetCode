class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n: nums){
            //if its first 2 element then put them as it is or
            //if current element is greater than i-2 th element then only put them in array else keep
            //else move pointer ahead and keep i on the same position
            if(i<2 || n > nums[i-2]){
                nums[i++]=n;
            }
        }
        return i;
    }
}