class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //Intution here is we want in circular dependency.
        // Brute force make aray of side 2*n and find max increases time complex
        // we will find total - minimum sum of subarray
        //Just one case if all number are negative it will give wrong result so we also calculate max sum in linear array and return max of both
        int total =  nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        for(int i = 1; i< nums.length ; i++){
            total += nums[i];
            //Find max
            currMax += nums[i];
            if(currMax < nums[i]) currMax = nums[i];
            maxSum = Math.max(maxSum, currMax);
            //Find min
            currMin += nums[i];
            if(currMin > nums[i]) currMin = nums[i];
            minSum = Math.min(currMin, minSum);
        }
        int ans = total - minSum;
        if(ans == 0) return maxSum;
        return Math.max(ans, maxSum);
    }
}