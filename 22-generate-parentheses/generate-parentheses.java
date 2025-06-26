class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        helper(ans,0,0,n,"");
        return ans;
    }
    public void helper( List<String> ans,int o,int c,int n,String curr){
        if(o==c && (o+c ==2*n)){
            ans.add(curr);
        }
        if(o<n){
            helper(ans,o+1,c,n,curr+"(");
        }
        if(c<o){
            helper(ans,o,c+1,n,curr+")");
        }
    }
}