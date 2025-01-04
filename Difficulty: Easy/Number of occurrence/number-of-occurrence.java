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
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        
         int first=-1;
         int last =-1;
         
         while(left<=right){
             int mid = (left+right)/2;
             if(arr[mid]==target){
                  first = mid;
                  right = mid-1;
             }else if(arr[mid]>target){
                 right = mid -1;
             }else{
                 left = mid+1;
             }
         }
         
         left =0;
         right = arr.length-1;
         
         while(left<= right){
             int mid = (left+right)/2;
             
             if(arr[mid] == target){
                 last = mid;
                 left = mid+1;
                 
             }else if(arr[mid]<target){
                 left = mid+1;
             }else{
                 right = mid-1;
             }
         }
         
         if(last== -1 || first == -1){
             return 0;
         }else{
             return last-first+1;
         }
    }
}
