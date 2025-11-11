class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        Integer[][][] dp = new Integer[len][m+1][n+1];
        return helper(len-1,strs,m,n,dp);
    }
    public int helper(int index, String[] strs, int m, int n,Integer[][][] dp){
        if(index<0) return 0;
        if(dp[index][m][n] != null) return dp[index][m][n];
        int[] canPick = canPickString(strs[index], m, n);
        int pick = 0,notPick = 0;
        if(!(canPick[0]<0 || canPick[1]<0)){
            pick = 1+helper(index-1, strs, canPick[0], canPick[1],dp);
        }
        notPick = helper(index-1,strs,m,n,dp);
        return dp[index][m][n] = Math.max(pick,notPick);
    }
    public int[] canPickString(String str, int m, int n){
        for(char c : str.toCharArray()){
            if(c-'0'== 0) m-=1;
            else n-=1;
        }
        return new int[]{m,n};
    }
}