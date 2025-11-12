class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        helper(candidates,target,ans,new ArrayList<Integer>(),0);
        return ans;
    }

    public void helper(int[] candidates, int target, List<List<Integer>> ans, List<Integer> temp, int idx) {
        if (target < 0 || idx >= candidates.length) return;
        if (target == 0) {
            // here we crete a deep copy of current list
            ans.add(new ArrayList(temp));
            return;
        }
        int currInt = candidates[idx];
        if(target-currInt >= 0 ){
        temp.add(currInt);
        helper(candidates, target - currInt, ans, temp, idx);
        temp.remove(temp.size() - 1);
        }
        helper(candidates, target, ans, temp, idx+1);
    }
}