class Solution {
    public int climbStairs(int n) {
        //uisng DP and tabulation approach
        if(n==1)return 1;
        int p1=2;
        int p2=1;
        for(int i=3;i<=n;i++){
            int count = p1+p2;
            p2=p1;
            p1=count;
        }
        return p1;
    }
}