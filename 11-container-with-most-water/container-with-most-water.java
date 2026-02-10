class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int ans = (end-start)*Math.min(height[start],height[end]);

        while(end > start){
            if(height[start]>=height[end]){
                end--;
            }else{
                start++;
            }
            ans = Math.max(ans, (end-start)*Math.min(height[start],height[end]));
        }
        return ans;
    }
}