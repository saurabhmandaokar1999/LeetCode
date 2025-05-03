class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int temp =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
               ans=Math.max(ans,temp);
                temp=0;
            }else{
                temp++;
            }
        }
        return Math.max(ans,temp);
    }
}