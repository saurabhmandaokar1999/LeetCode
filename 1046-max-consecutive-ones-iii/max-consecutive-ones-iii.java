class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,zcnt=0,ans=0;
        while(r<nums.length){
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