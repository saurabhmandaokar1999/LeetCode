class Solution {
    public int climbStairs(int n) {
        int prev = 1;
        int lastPrev = 1;
        int curr =0;
        for(int i=2;i<=n;i++){
            curr = prev+lastPrev;
            prev = lastPrev ;
            lastPrev = curr;
        }
        return lastPrev;
    }
}