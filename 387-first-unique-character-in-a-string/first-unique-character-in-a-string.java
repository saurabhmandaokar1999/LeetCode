class Solution {
    public int firstUniqChar(String s) {
        int ans=-1;
         HashMap<Character, Integer> map = new HashMap<>();
         char[] c = s.toCharArray();

         for(char p :c){
            if(map.containsKey(p)){
                map.put(p,map.get(p)+1);
            }else{
                map.put(p,1);
            }
         }
         for(int i = 0;i<c.length;i++){
            if(map.get(c[i])==1){
                return i;
            }
         }
         return ans;
    }
}