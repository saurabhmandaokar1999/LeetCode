class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for(int i = 0; i<nums.length;i++){
            int curr = nums[i];
            ans+=Arrays.stream(nums).skip(i).filter(f->f==curr).count()-1;
        }
        return ans;
    }
}