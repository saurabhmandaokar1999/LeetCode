class Solution {
    public int maximumCount(int[] nums) {
        int p=0;
        int n=0;
        for(int i : nums){
            if(i>0){
                p++;
            }else{
             if(i<0){
                n++;
            }
            }
            }
         int ans = Math.max(p,n);
        return ans;
        }

    }