class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int l = 0;
        int r = 0;
        int len = s.length();
        
        while (r <len) {
            char curr = s.charAt(r);
            if(map.containsKey(curr)){l= Math.max(map.get(curr)+1,l);}
            ans=Math.max(ans,r-l+1);
            map.put(curr, r);
            r++;
        }
        return ans;
    }
}
