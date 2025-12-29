class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target = image[sr][sc];
        int m = image.length;
        int n = image[0].length;
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        boolean vis[][] = new boolean[m][n];
        Queue<Pair<Integer,Integer>> q = new ArrayDeque<>();
        image[sr][sc] = color;
        q.offer(new Pair<>(sr,sc));
        while(!q.isEmpty()){
            int x = q.peek().getKey();
            int y = q.peek().getValue();
            q.poll();
            for(int[] d : dir ){
                int a = x+d[0];
                int b = y+d[1];
                if(a>=0 && b>=0 && a < m && b < n && image[a][b] == target && !vis[a][b]){
                    q.offer(new Pair<>(a,b));
                    image[a][b] = color;
                    vis[a][b] = true;
                }
            }
        }
        return image;  
    }
}