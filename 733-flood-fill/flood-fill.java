class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //Using dfs or reccursion
        int[][] dir = new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        int target = image[sr][sc];
        int m = image.length;
        int n = image[0].length;
        boolean[][] vis = new boolean[m][n];
        dfs(sr, sc, m, n, image, color, target, dir, vis);
        return image;
    }
    public void dfs(int x, int y,int m, int n, int[][] image, int color, int target, int[][] dir, boolean[][] vis){
        if(x >=0 && y >= 0 && x < m && y < n && image[x][y] == target && !vis[x][y]){
            image[x][y] = color;
            vis[x][y] = true;
            for(int[] d : dir){
                int a = x+d[0];
                int b = y+d[1];
                dfs(a,b,m,n,image,color,target,dir,vis);
            }
        }
    }
}