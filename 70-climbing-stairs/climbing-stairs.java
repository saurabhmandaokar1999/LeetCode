class Solution {
    public int climbStairs(int n) {
        int prev = 1;
        int lastPrev = 1;
        for(int i=2;i<=n;i++){
            int curr = prev+lastPrev;
            prev = lastPrev ;
            lastPrev = curr;
        }
        return lastPrev;
    }
}