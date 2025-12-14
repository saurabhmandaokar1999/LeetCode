class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        int idx = -1;
        for(int i = len-1; i >=0;i--){
            if((num.charAt(i)-'0') % 2 != 0){
                idx =  i;
                break;
            }
        }
        return num.substring(0,idx+1);
    }
}