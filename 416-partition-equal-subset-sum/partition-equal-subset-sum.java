class Solution {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
        int tar = sum/2;
        // make dp array
        boolean[][] dp = new boolean[len][tar+1];
        
        for(boolean[] temp:dp){
            Arrays.fill(temp,false);
        }
        //base case for tar=0 coloumn
        for(int i=0;i<len;i++){
            dp[i][0]=true;
        }

        // base case for nums[0] if we reach at tar = nums[0] we get true
        if(nums[0]<=tar){
            dp[0][nums[0]]=true;
        }

        //fill rest of dp array
        for(int i=1;i<len;i++){
            for(int j=1;j<=tar;j++){
                boolean np = dp[i-1][j];
                boolean p = false;
                if(nums[i]<=j){
                    p=dp[i-1][j-nums[i]];
                }
                dp[i][j] = p||np;
            }
        }
        return dp[len-1][tar];
    }
}