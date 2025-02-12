class Solution {
    public long countBadPairs(int[] nums) {
        Map<Long,Long> map = new HashMap<>();
        long len = nums.length;
        long good=0;
        //Total pairs there can be 
        long total = (len*(len-1))/2;
        //we will calculate good pairs and then substract from total.
        for(int i=0;i<nums.length;i++){
            long curr = nums[i]-i;
            if(map.containsKey(curr)){
                long temp=map.get(curr);
                good=good-(temp*(temp-1))/2;
                temp+=1;
                good=good+(temp*(temp-1))/2;
                map.put(curr,temp);
            }else{
                map.put(curr,(long)1);
            }
        }
        return total-good;
    }
} 