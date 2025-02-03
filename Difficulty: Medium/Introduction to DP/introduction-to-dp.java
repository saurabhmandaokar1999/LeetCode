//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            long topDownans = obj.topDown(n);
            long bottomUpans = obj.bottomUp(n);
            if (topDownans != bottomUpans)
                System.out.println(-1);
            else
                System.out.println(topDownans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
 static long mod = 1000000007;
    static long topDown(int n) {
        long[] arr=new long[n+1];
        Arrays.fill(arr, -1);
        return helper(n ,arr);
    }
    static long helper(int n,long[] arr){
        if(n==0)return 0;
        if(n==1)return 1;
        if(arr[n]!=-1) return arr[n];
        
        return arr[n]=(helper(n-1,arr)+helper(n-2,arr))%mod;
    }
    static long bottomUp(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    long p1 = 0, p2 = 1;
    for (int i = 2; i <= n; i++) {
        long curr = (p1 + p2)%mod;
        p1 = p2;
        p2 = curr;
    }
    return p2;
}
}
