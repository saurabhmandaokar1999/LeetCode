class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lMax=height[l];
        int rMax=height[r];
        int ans = 0;
        while(l<r){
            if(lMax>=rMax){
                int curr = height[--r];
                if(curr<rMax){
                    ans+=rMax-curr;
                }else{
                    rMax=curr;
                }
            }else{
                int curr = height[++l];
                if(curr<lMax){
                    ans+=lMax-curr;
                }else{
                    lMax=curr;
                }
            }
        }
        return ans;

    }
}