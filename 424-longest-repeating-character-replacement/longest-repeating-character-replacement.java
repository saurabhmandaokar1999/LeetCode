class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map= new HashMap<>();
        int l=0,r=0,max=0,ans=0;
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            max=Math.max(max,map.get(s.charAt(r)));
            while((r-l+1)-max>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            ans=Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }
}