class Solution {
    public String reverseWords(String s) {
        int start = 0;
        int end = 0;
        StringBuilder ans = new StringBuilder();
        StringBuilder curr = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c ==' '){
                if(curr.length() > 0) {
                    ans.insert(0,curr);
                    ans.insert(0, " ");
                }
                curr.setLength(0);
            }else{
                curr.append(c);
            }
        }
        if(curr.length() > 0) {
                ans.insert(0,curr);
                ans.insert(0, " ");
                }
        return ans.substring(1,ans.length()).toString();
    }
}