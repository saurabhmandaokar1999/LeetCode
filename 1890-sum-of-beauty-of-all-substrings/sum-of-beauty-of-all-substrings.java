class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            int[] freq = new int[26];
            for(int j=i;j<len;j++){
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                char c = s.charAt(j);
                freq[c-'a']++;
                for(int k=0;k<26;k++){
                     if (freq[k] > 0){
                    min = Math.min(min,freq[k]);
                    max = Math.max(max,freq[k]);
                    }
                }
                ans += max-min;
            }
        }
        return ans;
    }
}