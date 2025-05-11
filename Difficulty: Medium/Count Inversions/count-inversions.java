//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int count;
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        int left = 0;
        count=0;
        int right = arr.length-1;
        mergeSort(arr,left,right);
        return count;
    }
     static void mergeSort(int arr[], int left,int right){
        if(left>=right) return ;
        int mid = (left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    static void merge(int arr[] ,int left , int mid , int right){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int leftPointer = left;
        int rightPointer = mid+1;
        while(leftPointer<=mid && rightPointer<=right){
            if(arr[leftPointer]>arr[rightPointer]){
                count+=mid-leftPointer+1;
                list.add(arr[rightPointer++]);
            }else{
                list.add(arr[leftPointer++]);
            }
        }
        while(leftPointer<=mid){
            list.add(arr[leftPointer++]);
        }
        while(rightPointer<=right){
            list.add(arr[rightPointer++]);
        }
        for(int i=0;i<list.size();i++){
            arr[left++] = list.get(i);
        }
    }
}