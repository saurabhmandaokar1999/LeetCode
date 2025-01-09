class Solution {
    public String removeOuterParentheses(String s) {
        int countOut=0;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                countOut++;
                if(countOut>1){
                    sb.append(s.charAt(i));
                }
            }else{
                if(countOut>1){
                    sb.append(s.charAt(i));
                    countOut--;
                }else if(countOut==1){
                    countOut--;
                }
            }
        }

        return sb.toString();
    }
}