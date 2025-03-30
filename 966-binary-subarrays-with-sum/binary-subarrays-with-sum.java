class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
    public int helper(int[] nums,int goal){
        int ans = 0;
        int l=0;
        int r=0;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal && l<=r){
                sum-=nums[l++];
            }
           ans += (r - l + 1);;
            r++;
        }
        return ans;
    }
}