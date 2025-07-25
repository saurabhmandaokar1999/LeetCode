class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //Greedy solution
        Arrays.sort(g);
        Arrays.sort(s);
        int p=0;
        int r=0;
        int ans =0;
        while(p<g.length && r<s.length){
            if(g[p]<=s[r]){
                ans++;
                p++;
            }
             r++;
        }
        return ans;
    }
}