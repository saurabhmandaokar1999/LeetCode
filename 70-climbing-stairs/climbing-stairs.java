class Solution {
    public int climbStairs(int n) {
        int[] cache = new int[n+1];
        Arrays.fill(cache,-1);
        return helper(n,cache);
    }
    public int helper(int n , int[] cache){
        if(n==0) return 1;
        if(n==1) return 1;
        if(cache[n]!=-1) return cache[n];
        return cache[n]=helper(n-1,cache)+helper(n-2,cache);
    }

}