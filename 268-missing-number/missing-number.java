class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        if(nums[0]!=0) return 0;
        if(len==1) return nums[0]==0?1:0;
        for(int i=0;i<len-1;i++){
            if(nums[i]+1!=nums[i+1]) return nums[i]+1;
        }
        return len;
    }
}