import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        int ans = 0;
        int len = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int k = binarySearch(nums, nums[i] + nums[j], nums.length - 1, j);
                if(k == -1) continue;
                if(k > j) {
                    ans += k - j;  
                }
            }
        }
        return ans;
    }
    public int binarySearch(int[] nums, int target, int right, int left){
        int l = left + 1;
        int r = right;
        int res = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(nums[mid] < target){
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
}
