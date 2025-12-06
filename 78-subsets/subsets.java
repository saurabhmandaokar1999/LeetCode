class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int combi = (int)Math.pow(2, nums.length)-1;
        for(int i = 0; i<=combi ;i++){
            List<Integer> temp  = new ArrayList<>();
            int count = 0;
            int curr = i;
            while(curr != 0){
                if((curr & 1 )== 1 ){
                    temp.add(nums[count]);
                }
                curr >>= 1;
                count++;
            }
            ans.add(temp);
        }
        return ans;
    }
}