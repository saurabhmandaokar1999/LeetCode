class Solution {
    public int minInsertions(String s) {
        int l = s.length();
        StringBuilder sb = new StringBuilder(s);
        String r = sb.reverse().toString();
        int[][] dp = new int[l+1][l+1];
        for(int i=1;i<=l;i++){
            for(int j=1;j<=l;j++){
                if(s.charAt(i-1)==r.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return l-dp[l][l];
    }
}