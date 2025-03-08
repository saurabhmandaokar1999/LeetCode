class Solution {
    public boolean canPartition(int[] nums) {
        int tar =0,len=0;
        for(int i:nums){
            len++;
            tar+=i;
        }
        if(tar%2!=0) return false;

        boolean[][] dp = new boolean[len][(tar/2)+1];
        int NTar= tar/2;
        for(boolean arr[]:dp){
            Arrays.fill(arr,false);
        }
        for(int i=0;i<len;i++){
            dp[i][0]=true;
        }
        if(nums[0]<=NTar){
            dp[0][nums[0]]=true;
        }
        for(int i=1;i<len;i++){
            for(int j=1;j<=NTar;j++){
                boolean np=dp[i-1][j];
                boolean p=false;
                if(nums[i]<=j){
                    p=dp[i-1][j-nums[i]];
                }
                dp[i][j]= p||np;
            }
        }
        return dp[len-1][NTar];
    }
}