class Solution {
    public void rotate(int[] nums, int k) {
        //this is to find effective rotation when length of k is greater than arrays length
        k%=nums.length;
        //rotate the array completely
        rotate(nums,0,nums.length-1);
        //rotate first k element
        rotate(nums,0,k-1);
        //rotate rest of eleemnt in array 
        rotate(nums,k,nums.length-1);
    }

 //Function for rotating the array 
 public void rotate(int[] nums, int start, int end){
    while(start< end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }
  }
}