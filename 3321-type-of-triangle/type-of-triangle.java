class Solution {
    public String triangleType(int[] nums) {
        int sum=nums[0]+nums[1]+nums[2];
        int equalCount=0;
        for(int i=0;i<3;i++){
            if(i>0){
                if(nums[i]==nums[i-1]) equalCount++;
            }
            if(i>1){
                if(nums[i]==nums[i-2] && equalCount<2) equalCount++;
            }
            if(!(sum-nums[i]>nums[i])) return "none";
        }
        switch(equalCount){
            case 0:
            return "scalene";

            case 1:
            return "isosceles";

            case 2:
            return"equilateral";
        }
        return "";
    }
}