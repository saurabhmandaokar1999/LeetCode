class Solution {
    public String removeOuterParentheses(String s) {
        int open = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='('){
                open++;
                if(open > 1) sb.append(c);
            }else{
                if(open > 1) sb.append(c);
                open--;
            }
        }
        return sb.toString();
    }
}