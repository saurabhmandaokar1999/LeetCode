class Solution {
    public int longestSubarray(int[] nums) {
        int len = nums.length;
        if(len == 1) return 1;
        if(len == 2) return 2;
        int ans = 1;
        int[] left = new int[len];
        int[] right = new int[len];
        Arrays.fill(left,1);
        Arrays.fill(right,1);

        for(int i = 1 ; i<len ; i++){
            if(nums[i] >= nums[i-1]){
                int curr = left[i-1]+1; 
                left[i] = curr;
                ans = Math.max(curr, ans);
            }
        }
        for(int i = len-2 ; i>=0 ;i--){
            if(nums[i+1] >= nums[i]){
                int curr = right[i+1]+1;
                ans = Math.max(ans,curr);
                right[i] = curr;
            }
        }
        if(ans == len) return ans;
        if(ans < len ) ans++;

        for(int i=1 ; i < len-1 ; i++){
            if(nums[i-1] <= nums[i+1]){
                int curr  = left[i-1] + right[i+1] + 1;
                ans = Math.max(curr,ans);
            }
        }
        return ans;
    }
}