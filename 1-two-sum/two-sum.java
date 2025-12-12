class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){ 
            int diff= target-nums[i]; // Find the diffrence in number 
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i}; // If  present then return array
            }else{
                map.put(nums[i],i); // If not present then only add in map
            }
        }
        return new int[0]; // Return empty array if nothing is present.
    }
}