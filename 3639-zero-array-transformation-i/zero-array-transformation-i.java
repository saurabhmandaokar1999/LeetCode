class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        //using Line sweep algo to solve this
        int n = nums.length;
        int[] arr = new int[n+1];
        for(int[] temp : queries){
            int i=temp[0],j=temp[1];
            arr[i]--;
            //here we use +1 as we want to include the number
            arr[j+1]++;
        }
        int dec = 0;
        for(int i=0;i<n;i++){
            dec+=arr[i];
            if(nums[i]+dec>0){
                return false;
            }
        }
        return true;
    }
    //Explanation:
    //we maintain an array of decrement as in example 2 [[1,3],[0,2]]
    //here we can say idx 1,2 are decremented twice so we maintain  that in arr and then apply decrement later. 
}