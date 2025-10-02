class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left+((right-left)/2);
            if(nums[mid]==target || nums[left]==target) return true;
            if(nums[mid]==nums[left] && nums[mid]==nums[right]){
                left += 1;
                right -= 1;
            }
            else if(nums[mid]<=nums[right]){
                if(nums[mid]<target && target <= nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }else{
                if(nums[left]<=target && nums[mid]>target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
        }
        return false;
    }
}