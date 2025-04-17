import java.util.Stack;

class Solution {
    public long subArrayRanges(int[] nums) {
        int len = nums.length;
        return sumMax(nums, len) - sumMin(nums, len);
    }

    public long sumMin(int[] nums, int len) {
        int[] minPrev = new int[len];
        int[] minNext = new int[len];
        long ans = 0;
        prevMin(nums, minPrev, len);
        nextMin(nums, minNext, len);
        for (int i = 0; i < len; i++) {
            int l = i - minPrev[i];
            int r = minNext[i] - i;
            ans += (long) l * r * nums[i];
        }
        return ans;
    }

    public long sumMax(int[] nums, int len) {
        int[] maxPrev = new int[len];
        int[] maxNext = new int[len];
        long ans = 0;
        prevMax(nums, maxPrev, len);
        nextMax(nums, maxNext, len);
        for (int i = 0; i < len; i++) {
            int l = i - maxPrev[i];
            int r = maxNext[i] - i;
            ans += (long) l * r * nums[i];
        }
        return ans;
    }

    public void prevMin(int[] nums, int[] minPrev, int len) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < len; i++) {
            while (!stk.isEmpty() && nums[stk.peek()] > nums[i]) stk.pop();
            minPrev[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
    }

    public void nextMin(int[] nums, int[] minNext, int len) {
        Stack<Integer> stk = new Stack<>();
        for (int i = len - 1; i >= 0; i--) {
            while (!stk.isEmpty() && nums[stk.peek()] >= nums[i]) stk.pop();
            minNext[i] = stk.isEmpty() ? len : stk.peek();
            stk.push(i);
        }
    }

    public void prevMax(int[] nums, int[] maxPrev, int len) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < len; i++) {
            while (!stk.isEmpty() && nums[stk.peek()] < nums[i]) stk.pop();
            maxPrev[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
    }

    public void nextMax(int[] nums, int[] maxNext, int len) {
        Stack<Integer> stk = new Stack<>();
        for (int i = len - 1; i >= 0; i--) {
            while (!stk.isEmpty() && nums[stk.peek()] <= nums[i]) stk.pop();
            maxNext[i] = stk.isEmpty() ? len : stk.peek();
            stk.push(i);
        }
    }
}
