class Solution {
    public static final long mod = 1000000007;
    public int numSub(String s) {
        long ans = 0;
        int j = 0;
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '1'){
                j = i;
                while(j < s.length() && s.charAt(j) == '1'){
                    j++;
                }
                ans = (ans+calculateSubstring(i,j,s));
                i = j-1;
            }
        }
        return (int)(ans%mod);
    }
    public long calculateSubstring(int i, int j, String s){
        long len = j-i;
        return (len*(len+1)/2)%mod;
    }
}