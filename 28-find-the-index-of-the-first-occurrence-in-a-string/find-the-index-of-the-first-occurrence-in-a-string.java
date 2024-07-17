class Solution {
    public int strStr(String haystack, String needle) {

        int left =0;
        int right =haystack.length();
        int nl = needle.length();
        if(nl>right){
            return -1;
        }
        for(;left<right;left++){
            String hs = haystack.substring(left,nl);
            if(hs.equals(needle)){
                return left;
            }
            else if(nl<right){
                nl++;
            }
        }
        return -1;
    }
}