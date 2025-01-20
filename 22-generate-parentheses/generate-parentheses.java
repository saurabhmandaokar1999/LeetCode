class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        helper(ans,n,0,0,"");
        return ans;

    }
    public void helper(List<String> ans , int n, int o, int c,String curr){
        if((o==c)&&(c+o==n*2)){
            ans.add(curr);
            return;
        }
        if(o<n) 
        {
            helper(ans,n,o+1,c,curr+"(");
        }
        if(c<o) 
        {
            helper(ans,n,o,c+1,curr+")");
        }
    }
}