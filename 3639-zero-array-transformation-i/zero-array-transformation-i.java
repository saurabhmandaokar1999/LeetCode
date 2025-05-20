class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int decArr[] = new int[nums.length+1];
        for(int[] arr : queries){
            int p = arr[0];
            int q = arr[1];
            decArr[p]--;
            decArr[q+1]++;
        }
        int dec = 0;
        for(int i=0;i<nums.length;i++){
            dec+=decArr[i];
            if(nums[i]+dec>0){
                return false;
                
            }
        }
        return true;
    }
}