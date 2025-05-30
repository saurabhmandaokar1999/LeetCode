class Solution {
    public String reverseWords(String s) {
        int start = 0;
        while(s.charAt(start)==' ') start++;
        
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(int i=start;i<s.length();i++){
        if(s.charAt(i)!=' '){
            sb.append(s.charAt(i));
        }else{
            if(sb.length()>0){
            ans.insert(0,' '+sb.toString());
            sb.setLength(0);
            }
        }
      } 
    if(sb.length() > 0){
        ans.insert(0,sb.toString());
    }
    if(ans.length() > 0 && ans.charAt(0) == ' '){
        ans.deleteCharAt(0);
    }
      return ans.toString();
    }
}