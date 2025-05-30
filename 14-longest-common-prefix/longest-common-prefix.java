class Solution {
    public String longestCommonPrefix(String[] strs) {
        //find smallest string
        String str = strs[0];
        int len = str.length();
        for(String s : strs){
            if(s.length()<len){
                len=s.length();
                str=s;
            }
        }
        for(int i=0;i<strs.length;i++){
            if(str.length()==0) break;
            if(!strs[i].substring(0,str.length()).equals(str)){
                str=str.substring(0,str.length()-1);
                i=-1;
            }
        }
        return str;
    }
}