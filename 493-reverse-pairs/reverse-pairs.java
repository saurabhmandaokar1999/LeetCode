class Solution {
    public int counter = 0; 
    public int reversePairs(int[] nums) {
        int len = nums.length;
        mergeSort(nums, 0, len-1, len); 
        return counter;
    }
    private void mergeSort(int[] nums ,int left , int right, int len){
        //breaking condition;
        if(left >= right) return;
        int mid = left+(right-left)/2;
        mergeSort(nums, left, mid,len);
        mergeSort(nums, mid+1, right,len);
        counterHelper(nums, left, mid,right);
        merge(nums, left, mid, right);
    }
    public void merge(int[] nums, int left, int mid, int right){
        int [] ans = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int count = 0;
        while(i<= mid && j <=right){
            if(nums[i] < nums[j]){
                ans[count++] = nums[i++];
            }else{
                ans[count++] = nums[j++];
            }
        }
        while(i<= mid) ans[count++] = nums[i++];
        while(j<= right) ans[count++] = nums[j++];
        count = 0;
        for(int p = left; p<=right; p++){
            nums[p] = ans[count++]; 
        }
    }
    public void counterHelper(int[] nums, int left, int mid, int right){
        int i = left;
        int j = mid+1;
        //Two pointer approach
        while(i <= mid){
            while(j <= right && nums[i] > ((long)nums[j]*2)){
                j++;
            }
            counter += j-(mid+1);
            i++;
        }
    }
}