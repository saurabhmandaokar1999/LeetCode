class Solution {
    public boolean isValid(int[] nums, int k, int mid) {
        int split = 1, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum+nums[i] <= mid){
                sum += nums[i];
            } else {
                sum = nums[i];
                split++;
            }
        }
        return split <=k;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length, low = 0, high = 0;
        for (int i = 0; i < n; i++) {
            high += nums[i];
            low = Math.max(low, nums[i]);
        }
        int res = high;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (isValid(nums, k, mid)) {
                high = mid-1;
                res = Math.min(res, mid);
            } else {
                low = mid+1;
            }
        }
        return res;
    }
}