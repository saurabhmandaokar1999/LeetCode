//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of test cases
        String str = br.readLine();
        int t = Integer.parseInt(str.trim());

        // Process each test case
        while (t-- > 0) {
            // Read the next line containing the array elements
            str = br.readLine();
            String[] tokens = str.trim().split("\\s+");

            // Convert the input strings to integers and store in an array
            ArrayList<Integer> list = new ArrayList<>();
            for (String token : tokens) {
                if (!token.isEmpty()) { // Ensure that the token is not empty
                    list.add(Integer.parseInt(token));
                }
            }

            // Convert ArrayList to int[] for processing
            int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

            // Create an instance of Solution and compute the minimum energy
            Solution ob = new Solution();
            int result = ob.minCost(arr);

            // Output the result followed by a tilde as per the original C++ code
            System.out.println(result);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int len =height.length;
        int[] arr = new int[len+1];
        for(int i=0;i<=len;i++){
            arr[i]=-1;
        }
        return helper(height,len-1,arr);
    }
    int helper(int height[] ,int count,int arr[]){
        if(count==0)return 0;
        if(arr[count]!=-1) return arr[count];
        int one = helper(height,count-1,arr)+Math.abs(height[count]-height[count-1]);
        int two = (count-2>=0) ? helper(height,count-2,arr)+Math.abs(height[count]-height[count-2]):Integer.MAX_VALUE;
        return arr[count] = one<two ? one:two;
    }
}

//{ Driver Code Starts.

// } Driver Code Ends