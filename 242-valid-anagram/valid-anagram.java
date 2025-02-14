class Solution {
    public boolean isAnagram(String s, String t) {
        int lenS = s.length(),lenT = t.length();
        if(lenS!=lenT) return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<lenS;i++){
            char temp = s.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }

        for(int i=0;i<lenT;i++){
            char temp = t.charAt(i);
            if(map.containsKey(temp)){
                int freq = map.get(temp);
                if(freq>1){
                    map.put(temp,freq-1);
                }else{
                    map.remove(temp);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
}