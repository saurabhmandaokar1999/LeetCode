class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int len = nums.length;
         for(int i = 0; i< len ;i++){
            if(map.containsKey(target-nums[i])){
                ans[0] = i;
                ans[1] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i], i);
         }
         return ans;
    }
}