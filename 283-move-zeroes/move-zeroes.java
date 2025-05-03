class Solution {
    public void moveZeroes(int[] nums) {
        int right=nums.length-1;
        for(int i=0;i<right;i++){
            if(nums[i]==0){
                int temp=i;
                while(temp<right){
                    nums[temp]=nums[temp+1];
                    temp++;
                }
                nums[temp]=0;
                right--;
                i--;
            }
        }
    }
}