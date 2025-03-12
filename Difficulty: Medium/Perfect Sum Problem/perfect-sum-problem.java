//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        // Loop for each test case
        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution(); // Create an object of Solution class
            System.out.println(
                ob.perfectSum(nums, target)); // Call perfectSum and print the result
            System.out.println("~");          // Call perfectSum and print the result
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int[][] dp = new int[nums.length][target+1];
        for(int[] temp : dp){
            Arrays.fill(temp,-1);
        }
        return helper(nums,dp,nums.length-1,target);
    }
    public int helper(int[] nums, int[][]dp,int idx,int tar){
        if(idx==0){
            if(tar==0 && nums[0]==0) return 2;
            if(tar==0 || nums[0]==tar) return 1;
            return 0;
        }
        
        if(dp[idx][tar]!=-1) return dp[idx][tar];
        
        int np=helper(nums,dp,idx-1,tar);
        
        int p=0;
        if(nums[idx]<=tar){
            p=helper(nums,dp,idx-1,tar-nums[idx]);
        }
        dp[idx][tar]=p+np;
        
        return dp[idx][tar];
    }
}