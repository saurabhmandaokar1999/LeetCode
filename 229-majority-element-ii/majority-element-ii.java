class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        int requiredLen = len/3;
        //sorting attay wil take nlog(n)
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int count = 1;
        for(int i = 1; i < len ; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                if(count > requiredLen) ans.add(nums[i-1]);
                count=1;
            }
        }
        if(count > requiredLen){
            ans.add(nums[len-1]);
        }
        return ans;
    }
}