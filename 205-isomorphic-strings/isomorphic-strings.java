class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hs = new HashMap<>();
        HashMap<Character,Character> ht = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(hs.containsKey(s.charAt(i))){
                if(hs.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                hs.put(s.charAt(i),t.charAt(i));
            }
            if(ht.containsKey(t.charAt(i))){
                if(ht.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }else{
                ht.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}