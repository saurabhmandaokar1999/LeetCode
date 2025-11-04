class Solution {
    public int minCost(String colors, int[] neededTime) {
        int len = colors.length();
        int ans = 0;
        int sum = 0;
        int max = 0;
        for(int i = 1; i < len ; i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                if(max == 0) {
                    ans += neededTime[i-1];
                    max = neededTime[i-1];
                }
                max = Math.max(max,neededTime[i]);
                ans += neededTime[i];
            }else{
                ans -= max;
                max = 0;
            }
        }
        return ans-max;
    }
}