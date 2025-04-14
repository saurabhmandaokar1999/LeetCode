class Solution {
    public int trap(int[] height) {
        Stack<Integer> stk = new Stack<>();
        int ans = 0;
        for(int r=0;r<height.length;r++){
            while(!stk.isEmpty() && height[stk.peek()]<height[r]){
                int m = stk.pop();
                if (stk.isEmpty()) break; 
                int l = stk.peek();
                int h = Math.min(height[l],height[r])-height[m];
                int w = r-l-1;
                ans+=h*w;
            }
            stk.push(r);
        }
        return ans;
    }
}