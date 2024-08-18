class Solution {
    public int findMaxLength(int[] nums) {
        //Declare variables
        //if element is 0 increase sum if 1 decrease sum
        //map each sum with first seen index 
        //The solution is simple amount of zero and one between the sum that is seen again and for the first  
        //time will be equal. we need to find the length between first occurance of sum and last occurance of 
        //sum and and update the maximum length if it is max
        //Use a map to have sum and its index mapped for o(1) serching complexiety
        int len=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        //This setp is imp as if the sub array is from 0th index then th initial point will be -1 to give the proper length
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum++;
            }else{
                sum--;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }else{
                len= Math.max(i-map.get(sum),len);
            }
        }
        return len;
    }
}