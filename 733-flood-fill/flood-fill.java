class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        boolean[][] vis = new boolean[m][n];

        int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        int target = image[sr][sc];
        Queue<Integer[]> q = new ArrayDeque<>();
        q.offer(new Integer[]{sr,sc});
        image[sr][sc] = color;
        while(!q.isEmpty()){
            Integer[] cordinates = q.poll();
            int r = cordinates[0];
            int c = cordinates[1];
            for(int[] d : dir){
                int row = r+d[0];
                int col = c+d[1];
                if(row >= 0 && col >=0 && row < m && col < n && image[row][col] == target && !vis[row][col]){
                    image[row][col] = color;
                    vis[row][col] = true;
                    q.offer(new Integer[]{row, col});
                }
            }
        }
        return image;
    }
}