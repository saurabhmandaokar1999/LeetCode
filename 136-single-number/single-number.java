class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> temp = new HashMap<Integer,Integer>();
        for(int num: nums){
            if(temp.containsKey(num)){
                temp.put(num,2);
            }else{
                temp.put(num,1);
            }
        }
        for(int num:nums){
            if(temp.get(num)==1){
                return num;
            }
        }
        return 0;

    }
}