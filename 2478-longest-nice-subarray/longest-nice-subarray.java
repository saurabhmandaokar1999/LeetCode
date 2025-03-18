class Solution {
    public int longestNiceSubarray(int[] nums) {
        int ans=1;
        for(int i=0;i<nums.length-1;i++){
            int temp=1;
            int val=nums[i];
            for(int j=i+1;j<nums.length;j++){
               if((val & nums[j]) == 0){
                temp++;
                val=val | nums[j];
               }else{
                break;
               }
            }
            ans = Math.max(ans,temp);
        }
     return ans;
    }
}