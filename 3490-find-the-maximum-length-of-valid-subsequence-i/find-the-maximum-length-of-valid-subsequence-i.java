class Solution {
    public int maximumLength(int[] nums) {
        int o=0;
        int e=0;
        int alt=1;

        for(int i :nums){
            if(i%2==0){
                e++;
            }else{
                o++;
            }
        }
        if(e==nums.length || o==nums.length) return Math.max(e,o);
        boolean lastEven=nums[0]%2==0;
        for(int i=1;i<nums.length;i++){
            boolean curr = nums[i]%2==0;
            if(curr!=lastEven){
                lastEven=curr;
                alt++;
            }
        }
        return Math.max(o,Math.max(e,alt));
    }
}