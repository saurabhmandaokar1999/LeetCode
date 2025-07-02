class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans,candidates,target,0,new ArrayList<Integer>());
        return ans;
    }
    public void helper(List<List<Integer>> ans,int[] candidates, int target,int index,List<Integer>curr){
        if(index == candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        if(target-candidates[index]>=0){
            curr.add(candidates[index]);
            helper(ans,candidates,target-candidates[index],index,curr);
            curr.remove(curr.size()-1);
        }
        helper(ans,candidates,target,index+1,curr);
    }
}