class Solution {
    public String removeOuterParentheses(String s) {
        //This is the simplest soluton
        // we maintain an integer open 
        //This integer  is used to check if there is more than 1 open bracket then only append the current bracket else 
        // skip the character significanlty reduces space and makes logic simple
        int open = 0;
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c=='('){
                open++;
                if(open > 1) sb.append(c);
            }else{
                if(open>1) sb.append(c);
                open--;
            }
        }
        return sb.toString();
    }
}