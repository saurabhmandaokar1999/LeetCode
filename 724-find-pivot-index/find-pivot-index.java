class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0, left=0, len = nums.length;
        for(int i=0;i<len;i++){
            total+=nums[i];
        }
        int ans=0;
        while(ans<len){
            if(2*left == total-nums[ans]){
                return ans;
            }
            left+=nums[ans++];
        }
        return -1;
    }
}