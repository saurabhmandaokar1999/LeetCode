class Solution {
    public int numDistinct(String s, String t) {
        //here  we know t will always exaust first
        int ls=s.length();
        int lt=t.length();
        int[][] dp = new int[ls][lt];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return helper(ls-1,lt-1,s,t,dp);
    }
    public int helper(int ls,int lt,String s,String t,int[][] dp){
        if(lt<0) return 1;
        if(ls<0) return 0;

        if(dp[ls][lt]!=-1) return dp[ls][lt];

        if(s.charAt(ls)==t.charAt(lt)){
            return dp[ls][lt]=helper(ls-1,lt-1,s,t,dp) + helper(ls-1,lt,s,t,dp);
        }else{
            return dp[ls][lt]=helper(ls-1,lt,s,t,dp);
        }
    }
}