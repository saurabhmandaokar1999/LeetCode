class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k>len) k = k%len;
        rotate(0,len-1,nums);
        rotate(k,len-1,nums);
        rotate(0,k-1,nums);
    }
    public void rotate(int start, int end ,int[] nums){
        while(start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}