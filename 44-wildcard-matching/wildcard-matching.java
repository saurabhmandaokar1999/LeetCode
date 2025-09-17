class Solution {
    public boolean isMatch(String s, String p) {
        Boolean[][] dp = new Boolean[s.length()][p.length()];
        return helper(s,p,0,0,dp);
    }
    public boolean helper(String s, String p, int i,int j,Boolean[][] dp){
        if(i==s.length() && j==p.length()){
            return true;
        }else{
            if(i<s.length() && j==p.length()) return false;
        }
        if(i==s.length()){
            int len = p.length();
            while(j<len){
                if(p.charAt(j)!='*') return false;
                j++;
            }
            return true;
        }
        if(dp[i][j]!=null) return dp[i][j];
        //more base case
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
           return dp[i][j]= helper(s,p,i+1,j+1,dp);
        }else{
            if(p.charAt(j)=='*') return dp[i][j]=helper(s,p,i+1,j,dp) || helper(s,p,i,j+1,dp);
        }
        return false;
    }
}