class Solution {
    public int minAddToMakeValid(String s) {
        int o = 0, c = 0, ans = 0;

        if(s.length() == 1) return 1;
        for(char chr : s.toCharArray()){
            if(chr == ')'){
                if(o <= 0) ans++;
                else {
                    o--;
                }
            }else{
                o++;
            }
        }
        return ans+o;
    }
}