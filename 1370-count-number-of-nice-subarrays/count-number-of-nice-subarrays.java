class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        //using 2 pointers
        return helper(nums,k) - helper(nums,k-1);
    }
    //this is a helper func
    public int helper(int[] nums , int k){
        int ans=0,sum=0;
        int l=0,r=0;
        int len = nums.length;
        while(r<len){
            //Convert odd and even to binary as it wewant to count even adn add count
            sum += (nums[r]%2);
            while(sum>k && r>=l ){
                sum-= (nums[l]%2);
                l++;
            }
            ans += r-l+1;
            r++;
        }
        return ans;
    }
}
