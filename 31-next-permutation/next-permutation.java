class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int piviot = -1 ;
        for(int i = len-2 ; i>=0; i-- ){
            if(nums[i] < nums[i+1]){
                piviot = i;
                break;
            }
        }
        for(int i = len-1 ; i > piviot ;i--){
            if(piviot >=0 && nums[piviot] < nums[i]){
                int temp = nums[piviot];
                nums[piviot] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        sortDesc(nums, piviot+1, len-1);
    }
    private void sortDesc(int[] nums,int start, int end){
       while(start < end ){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
       } 
    }
}