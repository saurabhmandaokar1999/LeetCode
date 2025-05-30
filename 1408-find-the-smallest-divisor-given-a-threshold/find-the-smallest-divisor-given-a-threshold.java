class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=0; 
        for(int n:nums){
            right=Math.max(right,n);
        }
        int sum = 0;

        while(left<=right){
           int mid = (left+right)/2;
           int tempSum = getSum(nums,mid);
           if(tempSum>threshold){
            left=mid+1;
           }else{
            right=mid-1;
           }
        }
        return left;
    }
    public int getSum(int[] nums,int curr){
        int ans =0;
        for(int num:nums){
            ans+=(num+curr-1)/curr;
        }
        return ans;
    }
}