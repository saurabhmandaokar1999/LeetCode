class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rowLen = mat.length;
        int colLen = mat[0].length;
        int i = 0;
        int j = 0;
        int[] ans = new int[2];
        while(i < rowLen && j < colLen){
            if(j>=1 && mat[i][j] < mat[i][j-1]){
                j--;
            }else if(i>=1 && mat[i][j] < mat[i-1][j]){
                i--;
            }else if(i<rowLen-1 && mat[i][j] < mat[i+1][j] ){
                i++;
            }else if(j<colLen-1 && mat[i][j] < mat[i][j+1]){
                j++;
            }else{
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
        }
        return ans;
    }
}