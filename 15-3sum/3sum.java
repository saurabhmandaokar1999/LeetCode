
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int complement = -nums[i] - nums[j];
                if (seen.contains(complement)) {
                    res.add(Arrays.asList(nums[i], complement, nums[j]));
                    while (j + 1 < n && nums[j] == nums[j + 1]) j++;
                }
                seen.add(nums[j]);
            }
        }


        return res;
    }
}
