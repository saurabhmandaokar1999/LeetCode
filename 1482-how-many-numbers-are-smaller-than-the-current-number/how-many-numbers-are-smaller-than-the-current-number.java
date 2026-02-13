class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int [] ans = new int[len];
        for(int i = 0; i< len ;i++){
             int temp = i;
            ans[i] = (int)Arrays.stream(nums).filter(p->p<nums[temp]).count();                          
        }
        return ans;
    }
}