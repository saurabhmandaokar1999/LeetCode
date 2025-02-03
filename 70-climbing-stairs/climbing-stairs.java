class Solution {
    public int climbStairs(int n) {
        //uisng DP and memoization approach
        int[] arr = new int [n+1];
        Arrays.fill(arr,-1);
        return helper(n ,arr);
        
    }
    public int helper(int n, int[] arr){
        if(n==1)return 1;
        if(n==2) return 2;
        if(arr[n]!=-1) return arr[n];
        return arr[n]=helper(n-1,arr)+helper(n-2,arr);
    }
}