class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        int[][] dp = new int[l1][l2];
        for(int[] d:dp){Arrays.fill(d,-1);}
        return helper(text1,text2,l1-1,l2-1,dp);
    }
    public int helper(String t1, String t2,int l1,int l2,int[][] dp){
        if(l1<0 || l2<0){
            return 0;
        }
        if(dp[l1][l2]!=-1) return dp[l1][l2];
        if(t1.charAt(l1) == t2.charAt(l2)){
            return dp[l1][l2] = 1+ helper(t1,t2,l1-1,l2-1,dp);
        }else{
            return dp[l1][l2] = 0+Math.max(helper(t1,t2,l1-1,l2,dp),helper(t1,t2,l1,l2-1,dp));
        }
    }
}