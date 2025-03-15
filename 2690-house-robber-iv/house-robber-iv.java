class Solution {
    public int minCapability(int[] nums, int k) {
        int min =nums[0];
        int max =nums[0];
        int ans=0;
        for(int i : nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        while(min<=max){
            int mid=(min+max)/2;
            if(isPossible(nums,k,mid)){
                ans=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] nums,int k,int mid){
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                k--;
                i++;
            }
        }
        return k<=0;
    }
}