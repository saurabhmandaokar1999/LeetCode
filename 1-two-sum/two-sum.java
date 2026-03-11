class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length;i++){
            int t = target-nums[i];
            if(map.containsKey(t)){
                ans[0] = i;
                ans[1] = map.get(t);
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}