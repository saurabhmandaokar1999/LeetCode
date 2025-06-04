class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<2) return true;
        int i=0;
        int last = nums.length-1;
        while(i<last){
            if(nums[i]>=last-i){
                return true;
            }
            if(nums[i]==0){
                int temp=i-1;
                while(temp>=0){
                    if(nums[temp]>i-temp){
                        break;
                    }else{
                        temp--;
                    }
                }
                if(temp<0) return false;
            }
            i++;
        }
     return false;
    }
}