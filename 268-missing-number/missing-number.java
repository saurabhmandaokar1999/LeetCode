class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i: nums){
            sum+=i;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        int requiredSum = 0;
        for(int i = 0; i<= max; i++){
            requiredSum+=i;
        }
        if(requiredSum == sum) {
            if(min != 0) return 0;
            return max+1;
        }
        return requiredSum-sum;
    }
}