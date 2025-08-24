class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int len = arr.length;
        int[][] dp = new int[len][sum+1];
        for(int[] d:dp){
        Arrays.fill(d,-1);
        }
        return helper(arr,sum,len-1,dp);
    }
    public static boolean helper(int arr[], int sum,int idx,int[][] dp){
        if(sum==0){
            return true;
        }
        if(sum<0 || idx<0) return false;
        
        if(dp[idx][sum]!=-1) return dp[idx][sum]==1;
        boolean pick = helper(arr,sum-arr[idx],idx-1,dp);
        boolean notPick= helper(arr,sum,idx-1,dp);
        dp[idx][sum] = pick || notPick ? 1:0;
        return pick||notPick;
    }
}