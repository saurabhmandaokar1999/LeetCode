class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i < len-1 ; i++){
            int j = i+1;
            int k = len-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k] == 0 && i!= j && j!= k && i!= k) {
                    ans.add(new ArrayList(Arrays.asList(nums[i],nums[j],nums[k]))); 
                    while(j< len-1 && nums[j]==nums[j+1]) j++;
                    j++;
                }
                else if(nums[i]+nums[j]+nums[k] > 0) k--;
                else j++;
            }
            while(i < len-1 && nums[i] == nums[i+1]) i++;
        }
        return ans;
    }
}