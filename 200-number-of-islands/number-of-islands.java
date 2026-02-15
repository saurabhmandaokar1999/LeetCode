class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        boolean[][] vis = new boolean[n][m];
        Queue<Pair<Integer,Integer>> q = new ArrayDeque<>();
        for(int i = 0; i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == '1' && !vis[i][j] ) {
                    q.offer(new Pair<>(i,j));
                    vis[i][j] = true;
                    bfs(q, grid, vis, n, m);
                    ans++;
                }
            }
        }
        return ans;
    }
    private void bfs( Queue<Pair<Integer,Integer>> q, char[][] grid, boolean[][] vis, int n, int m){
        while(!q.isEmpty()){
            Pair p = q.poll();
            
            int i = (int)p.getKey();
            int j = (int)p.getValue();
            
            int[] ar1 = new int[]{0,1,0,-1};
            int[] ar2 = new int[]{-1,0,1,0};
            for(int z = 0; z< 4; z++){
                int currI = i+ar1[z];
                int currJ = j+ar2[z];

                if(currI <n && currJ<m && currI>=0 && currJ>=0 && !vis[currI][currJ] && grid[currI][currJ] == '1'){
                    vis[currI][currJ] = true;
                    q.offer(new Pair(currI, currJ));
                }
            }

        }
    }
}