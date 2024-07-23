class Solution {
    public int majorityElement(int[] nums) {
        //sort an array
        Arrays.sort(nums);
        int n =nums.length;
        //For an element to apprear more then half of length of array it will be present at the midpoint
        return nums[n/2];
    }

}