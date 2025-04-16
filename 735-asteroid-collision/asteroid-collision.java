class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        
        for (int a : asteroids) {
            if (a > 0) {
                stk.push(a);
            } else {
                while (!stk.isEmpty() && stk.peek() > 0 && Math.abs(a) > stk.peek()) {
                    stk.pop();
                }

                if (!stk.isEmpty() && stk.peek() > 0 && Math.abs(a) == stk.peek()) {
                    stk.pop();

                    continue;
                }
                if (stk.isEmpty() || stk.peek() < 0) {
                    stk.push(a);
                }
            }
        }
        
        int[] ans = new int[stk.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stk.pop();
        }
        return ans;
    }
}
