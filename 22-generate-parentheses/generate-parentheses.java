class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, ans, "",0);
        return ans;
    }
    public void helper(int n, List<String> ans, String curr, int open){
        if(n == 0){
            ans.add(curr);
        }
        if(open > 0){
            helper(n-1, ans,curr + ")", open-1);
        }
       if(open < n) helper(n,ans,curr+"(",open+1);
    }
}