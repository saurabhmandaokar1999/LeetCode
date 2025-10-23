class Solution {
    public boolean hasSameDigits(String s){
       if(s.length() == 2){
        return s.charAt(0) == s.charAt(1);
       }
       StringBuilder sb = new StringBuilder();
       for(int i = 0;i < s.length()-1; i++){
        sb.append(((int)s.charAt(i)+(int)s.charAt(i+1))%10);
       }
       return hasSameDigits(sb.toString());
    }
}