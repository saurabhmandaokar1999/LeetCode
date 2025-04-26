class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int tarColor = image[sr][sc];
        int delRow[] = {-1,0,+1,0};
        int delCol[] = {0,+1,0,-1};
        dfs(image,ans,sr,sc,color,tarColor,delRow,delCol);
        return ans;
    }
    public void dfs(int[][]image,int[][]ans,int sr, int sc,int color ,int tarColor,int[] delRow,int[] delCol){
        int lenR = image.length;
        int lenC = image[0].length;
        ans[sr][sc]=color;
        for(int i=0;i<4;i++){
            int r =sr+delRow[i];
            int c =sc+delCol[i];
            if(r<lenR && c<lenC && r>=0 && c>=0 && image[r][c]==tarColor && ans[r][c]!=color){
                dfs(image,ans,r,c,color,tarColor,delRow,delCol);
            }
        }
    }
}