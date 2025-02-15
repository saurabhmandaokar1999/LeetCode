class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=1000000;
        while(left<=right)
        {
            int currSum=0;
            int mid=(left+right)/2;
            for(int num:nums)
            {
                currSum+=Math.ceilDiv(num, mid);
            }
            
            if(currSum<=threshold) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}