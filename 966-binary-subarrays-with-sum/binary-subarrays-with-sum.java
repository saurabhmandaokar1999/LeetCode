class Solution {
    // we will use prefix sum
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int sum = 0;
        int ans = 0;
        map.put(0,1);
        for(int i = 0; i < len;i++){
            sum += nums[i];
            int diff = sum - goal;
            if(map.containsKey(diff)){
                ans += map.get(diff);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}