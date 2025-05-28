class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c =='('){
                stk.push('(');
            } 
            if(c ==')'){
                if(stk.empty()){
                    continue;
                }
                stk.pop();
            }
            sb.append(c);
        }
        while(!stk.empty()){
            int idx = sb.lastIndexOf("(");
            sb.deleteCharAt(idx);
            stk.pop();
        }
        return sb.toString();
    }
}