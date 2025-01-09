class Solution {
    public String largestOddNumber(String num) {
        int right = num.length();
        while (right > 0) {
            right--; 
            if ((num.charAt(right) - '0') % 2 != 0) {
                return num.substring(0, right + 1);
            }
        }
        return "";
    }
}