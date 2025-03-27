class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int zcnt=0;
        int len = nums.length;
        int ans=0;
        while(r<len){
            if(nums[r]==0) zcnt++;
            while(zcnt>k){
                if(nums[l]==0) zcnt--;
                l++;
            }
            ans = Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }
}