class Solution {
    public int longestConsecutive(int[] nums) {
    int len = nums.length;
    if(len==0) return 0;
     Arrays.sort(nums);
     int ans=1;
     int max=1;
     for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]) continue;
        if(nums[i]==nums[i-1]+1){
            max++;
        }else{
            max=1;
        }
        ans = Math.max(max,ans);
     }   
     return ans;
    }
}