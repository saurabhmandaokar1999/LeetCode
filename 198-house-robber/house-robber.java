class Solution {
    public int rob(int[] nums) {
        //space optimized approach
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int p = nums[0];
        int pp = 0;
        for(int i=1;i<nums.length;i++){
            int curr = Math.max(nums[i]+pp,p);
            pp=p;
            p=curr;
        }
        return p;
    }
}