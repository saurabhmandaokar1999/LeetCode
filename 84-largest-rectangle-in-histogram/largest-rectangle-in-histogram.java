class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        int len = heights.length;
        int[] nse = new int[len];
        int[] pse = new int[len];
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<len;i++){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]) stk.pop();
            pse[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        stk.clear();
        for(int i=len-1;i>=0;i--){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]) stk.pop();
            nse[i] = stk.isEmpty() ? len : stk.peek();
            stk.push(i);
        }
        for(int i=0;i<len;i++){
            ans = Math.max(ans,heights[i] * (nse[i] - pse[i] - 1));
        }
        return ans;
    }
}