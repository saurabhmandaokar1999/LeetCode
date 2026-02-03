class Solution {
    public boolean isTrionic(int[] nums) {
        int isTri = 0;
        int i = 0;
        int len = nums.length;
        while(i < len-1 && nums[i]<nums[i+1]){
            i++;
        }
        if(i>0) isTri++;
        int f = i;
        while(i<len-1 && nums[i]> nums[i+1]){
            i++;
        }
        if(i!= f) isTri++;
        f=i;
        while(i < len-1 && nums[i] < nums[i+1]){
            i++;
        }
        if(f != i) isTri++;
        return (isTri ==3 && i == len-1);
    }
}