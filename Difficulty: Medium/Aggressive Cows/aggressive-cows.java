//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int len = stalls.length;
        int right = stalls[len-1]-stalls[0];
        int left = 0;
        while(left<=right){
            int mid = (left+right)/2;
            if(canPlace(stalls,k,mid)){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return right;
    }
    private static boolean canPlace(int[] stalls, int k, int space) {
        int count = 1;  
        int lastPos = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= space) {
                count++;
                lastPos = stalls[i];
                if (count == k) return true;
            }
        }
        return false;
    }
}