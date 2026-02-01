class Solution {
    public int minimumCost(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        for(int i = 3; i < nums.length;i++){

                if(b > c && b > nums[i]){
                b=c;
                c = nums[i];
                }
                if(c> nums[i]) c= nums[i];
        }
        return a+b+c;
    }
}