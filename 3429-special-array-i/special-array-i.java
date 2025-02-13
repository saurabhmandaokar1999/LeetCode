class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean isEven = nums[0]%2==0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2==0 != isEven){
                isEven=!isEven;
            }else{
                return false;
            }
        }
        return true;

    }
}