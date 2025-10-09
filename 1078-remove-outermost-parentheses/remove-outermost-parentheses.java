class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                stk.push(c);
                sb.append(c);
            }else{
                stk.pop();
                sb.append(c);
            }
            if(stk.isEmpty()){
                if(sb.length()>0){
                    ans.append(sb.substring(1,sb.length()));
                    ans.setLength(ans.length()-1);
                    sb.setLength(0);
                }
            }
        }
        return ans.toString();
    }
}