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
            int ans = sln.findPages(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        int len = arr.length;
        if(len<k) return -1;
         int min = arr[0];
        int max =0;
        for(int a:arr){
            max+=a;
            min = Math.max(min,a);
        }
       
        while(min<=max){
            int mid = (min+max)/2;
            if(noOfBooks(arr,mid,len)>k){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
        return min;
    }
    public static int noOfBooks(int[] arr,int mid, int len ){
        int sumOfPages=0;
        int studCount=1;
        for(int i:arr){
            if(sumOfPages+i<=mid){
                sumOfPages+=i;
            }else{
                studCount++;
                sumOfPages=i;
            }
        }
        return studCount;
    }
}