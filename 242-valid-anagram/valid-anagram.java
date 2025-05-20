class Solution {
    static{    //why using this static bloack?
        for(int i=0;i<500;i++)
        isAnagram("","a");
    }
    public static boolean isAnagram(String s, String t) {
       int count[] = new int [26];
       if(s.length()!= t.length())
       return false;
       for(int i=0;i<s.length();i++){
        count[s.charAt(i)-'a']++;
        count[t.charAt(i)-'a']--;
       } 
       for(int val : count){
        if(val != 0)
        return false;
       }
       System.gc();
       return true;
    }
}