class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates,target,res,new ArrayList<Integer>(),0);

        return res;
        
    }
    public void helper(int[] cand,int target,List<List<Integer>> res,List<Integer> temp,int count){
        if(count==cand.length){
            if(target==0){
              res.add(new ArrayList<>(temp));
            }
            return;
        } 
        if(cand[count]<= target){
            temp.add(cand[count]);
            helper(cand,target-cand[count],res,temp,count);
            temp.remove(temp.size()-1);
        }
        helper(cand,target,res,temp,count+1);
    }
}