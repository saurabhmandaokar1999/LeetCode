class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(candidates);
        helper(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void helper(int idx, int[] candidates, int target,List<List<Integer>> ans, List<Integer>temp){
        if(target == 0){
            List<Integer> lst = new ArrayList(temp);
            ans.add(lst);
            return;
        }
        if(target < 0 || idx >= candidates.length){
            return;
        }
        int curr = candidates[idx];
        temp.add(curr);
        helper(idx+1,candidates,target-curr,ans,temp);
        temp.remove(temp.size()-1);
        while(idx < candidates.length-1 && candidates[idx]==candidates[idx+1]){idx++;}
        helper(idx+1,candidates,target,ans,temp);
    }
}