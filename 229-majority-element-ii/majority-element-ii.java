class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int candi1 = 0, candi2 = 0;

        // First pass
        for (int num : nums) {
            if (num == candi1) {
                count1++;
            } else if (num == candi2) {
                count2++;
            } else if (count1 == 0) {
                candi1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candi2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second pass
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candi1) count1++;
            else if (num == candi2) count2++;
        }

        int threshold = nums.length / 3;
        if (count1 > threshold) ans.add(candi1);
        if (count2 > threshold) ans.add(candi2);

        return ans;
    }
}
