class Solution {
    public int longestPalindromeSubseq(String s) {
        int l= s.length();
        StringBuilder sb = new StringBuilder(s);
        String r = sb.reverse().toString();
        int[][] dp = new int[l][l];
        for(int[] d: dp){
            Arrays.fill(d,-1);
        }
        return helper(l-1,l-1,s,r,dp);
    }
    public int helper(int l1,int l2,String s,String r,int dp[][]){
        if(l1<0 || l2<0){
            return 0;
        }
        if(dp[l1][l2]!=-1) return dp[l1][l2];
        if(s.charAt(l1)==r.charAt(l2)){
            return dp[l1][l2] = 1+helper(l1-1,l2-1,s,r,dp);
        }else{
            return dp[l1][l2] = Math.max(helper(l1-1,l2,s,r,dp),helper(l1,l2-1,s,r,dp));
        }

    }
}