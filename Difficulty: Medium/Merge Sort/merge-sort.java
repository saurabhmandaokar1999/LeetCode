//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    void mergeArr(int arr[], int l, int m,int r){
        int[] myArr = new int[r-l+1];
        int lp=l;
        int rp=m+1;
        int count =0;
        while(lp<=m&&rp<=r){
            if(arr[lp]<=arr[rp]){
                myArr[count++]=arr[lp++];
            }else{
                myArr[count++]=arr[rp++];
            }
        }
        while(lp<=m){
            myArr[count++]=arr[lp++];
        }
        while(rp<=r){
            myArr[count++]=arr[rp++];
        }
        for(int i=0;i<myArr.length;i++){
            arr[l+i]=myArr[i];
        }
    }

    void mergeSort(int arr[], int l, int r) {
        
        if(l>=r) return;
        int m = (l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        mergeArr(arr,l,m,r);
    }

}
