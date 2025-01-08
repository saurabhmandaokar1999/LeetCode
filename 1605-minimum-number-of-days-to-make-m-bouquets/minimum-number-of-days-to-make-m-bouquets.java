class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        long len = bloomDay.length;
        if(len<(long)m*k){
            return -1;
        }
        for(int i = 0;i<len;i++){
            left = Math.min(left,bloomDay[i]);
            right = Math.max(right,bloomDay[i]);
        }
        while(left<=right){
            int mid = (left+right)/2;
            int isPossible= isPossible(bloomDay,mid,k,len);
            if(isPossible>=m){
                right=mid-1;
            }else{
            left=mid+1;
            }}
        return left;
    }
    public int isPossible(int[] arr,int day, int k,long len){
        int count = 0;
        int noOfB=0;
        for(int i=0;i<len;i++){
           if(arr[i]<=day){
            count++;
           }else{
            noOfB += (count / k);
                count = 0;
            }
        }
         noOfB += (count / k);
         return noOfB;
    }
}