class Solution {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        for(int i = 0; i < strs[0].length(); i++ ){
            ans +=isNotLexo(i, strs);
        }
        return ans;
    }
    public int isNotLexo(int col, String[] strs){
        for(int i = 1; i<strs.length; i++ ){
            if(strs[i].charAt(col)<strs[i-1].charAt(col)){
                return 1;
            }
        }
        return 0;
    }
}