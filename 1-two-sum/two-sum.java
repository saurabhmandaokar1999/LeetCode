class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int p=0; p<nums.length; p++){
            for(int q=0; q<nums.length; q++){
                if(nums[p]+nums[q]==target && p!=q){
                    arr[0]= p;
                    arr[1]=q;
                    return arr;
                }
            }
        }
        return null;
        
    }
}