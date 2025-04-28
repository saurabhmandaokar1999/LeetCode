class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<Integer[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int ans =0;
        //Find all boundry 1's and add to queue for bfs
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || j==0 || i==n-1||j==m-1)&&grid[i][j]==1){
                    q.offer(new Integer[]{i,j});
                    vis[i][j]=1;
                }
            }
        }
        int[] delR = {-1,0,1,0};
        int[] delC = {0,1,0,-1};
        //write bfs
        while(!q.isEmpty()){
            Integer[] temp = q.poll();
            int cr = temp[0];
            int cc = temp[1];
            int i=0;
            while(i<4){
                int r = cr+delR[i];
                int c = cc+delC[i];
                if(c>=0 && r>=0 && r<n && c<m && grid[r][c]==1 && vis[r][c]!=1){
                    q.offer(new Integer[]{r,c});
                    vis[r][c]=1;
                }
                i++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]!=1){
                    ans++;
                }
            }
        }
        return ans;
    }
}