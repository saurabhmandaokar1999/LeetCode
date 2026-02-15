class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i< nums.length;i++){
            int curr = target-nums[i];
            if(map.containsKey(curr)){
                ans[0] = map.get(curr);
                ans[1] = i;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}