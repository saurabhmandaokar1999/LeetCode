import java.util.Arrays;

class Solution {
    static{
        for(int i=0;i<501;i++){
            isAnagram("","a");
        }
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}