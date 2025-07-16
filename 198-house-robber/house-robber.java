class Solution {
    public int rob(int[] nums) {
        //space optimized approach
        int p = nums[0];
        int pp = 0;
        for(int i=1;i<nums.length;i++){
            int pick = nums[i]+pp;
            int curr = Math.max(pick,p);
            pp=p;
            p=curr;
        }
        return p;
    }
}