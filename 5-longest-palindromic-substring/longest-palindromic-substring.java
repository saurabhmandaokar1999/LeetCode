class Solution {
    public String longestPalindrome(String s) {
        //we use expand around the center
        int len = s.length();
        if(len == 1) return s;
        int start = 0;
        int end = 0;
        for(int i=0;i<len;i++){
            int odd = expandAroundCenter(s,i,i);
            int even = expandAroundCenter(s,i,i+1);
            int max = Math.max(odd,even);
            if(max> end-start){
                start = i-((max-1)/2);
                end = i+(max/2);
            }
        }
        return s.substring(start,end+1);
    }
    public int expandAroundCenter(String s,int i ,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        } 
        return j-i-1;
    }
}