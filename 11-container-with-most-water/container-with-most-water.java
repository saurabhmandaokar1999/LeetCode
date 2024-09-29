class Solution {
    public int maxArea(int[] height) {
        int front= 0;
        int last = height.length-1;
        //You can also use Math.max()
        //Just Using ternary operator for fun
        int area = (last-front)*((height[front]<height[last])?height[front]:height[last]);
        while(front<last){
            if(height[front]>height[last]){ last--;}
            else{ front++;}
            area = Math.max(area,(last-front)*((height[front]<height[last])?height[front]:height[last]));
        }
        return area;
    }
}