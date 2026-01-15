class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int len = nums.length;
        int ans = 0;
        for(int i = 0; i < len ;i++){
            int sum = 0;
            for(int j = i; j< len ;j++){
                sum += nums[j];
                if(sum == goal) ans++;
            }
        }
        return ans;
    }
}