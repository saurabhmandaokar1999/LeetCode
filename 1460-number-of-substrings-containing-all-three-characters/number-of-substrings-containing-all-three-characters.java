class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3];
        int l=0,r=0,ans=0;
        while(r<s.length()){ 
            arr[s.charAt(r)-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                ans+=s.length()-r;
                arr[s.charAt(l)-'a']--;
                l++;
            }
        r++;
        }
        return ans;
    }
}