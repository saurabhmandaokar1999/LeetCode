class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> result = new ArrayList<>();
       int len = nums.length;

       if(len == 0) 
            return result;
       
       int start = nums[0];

       for(int i=1; i<len; i++){

            if(nums[i]!=nums[i-1]+1){
          
                if(start == nums[i-1])
                    result.add(start+"");
                else
                    result.add(start + "->" + nums[i-1]);

                start = nums[i];
            }
       }

        if(start == nums[len-1])
            result.add(start+"");
        else
            result.add(start + "->" + nums[len-1]);

       return result;
    }
}