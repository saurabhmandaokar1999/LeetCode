class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(n,new StringBuilder(),0,0);
        return ans;
    }
    public void helper(int n,StringBuilder temp,int open,int close){
        if(temp.length()==(2*n)){
            ans.add(temp.toString());
        }
        if(open<n){
           helper(n,temp.append('('),open+1,close);
           temp.deleteCharAt(temp.length()-1);
        }
        if(open-close>0){
           helper(n,temp.append(')'),open,close+1);
           temp.deleteCharAt(temp.length()-1);
        }
    }
} 