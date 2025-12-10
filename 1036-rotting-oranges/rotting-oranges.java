class Solution {
    public int orangesRotting(int[][] grid) {
        int time = 0;
        int m = grid.length;
        int n = grid[0].length;
        Queue<Integer[]> q = new ArrayDeque<>();
        int dir[][] = new int[][] {{-1,0},{1,0},{0,-1},{0,1}};
        int fresh = 0;
    
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1) fresh++;
                if(grid[i][j] == 2) q.offer(new Integer[]{i,j});
            }
        }

        //BFS on grid
        while(!q.isEmpty()){
            boolean isFresh = false;
            int size = q.size();
            for(int p = 0; p < size; p++){
                Integer curr[] = q.poll();
                int i = curr[0];
                int j = curr[1];
                for(int[] d : dir){
                    int row = i+d[0];
                    int col = j+d[1];
                    if(row >= 0 && col >= 0 && row<m && col<n && grid[row][col] == 1){
                        q.offer(new Integer[]{row, col});
                        isFresh = true;
                        grid[row][col] = 2;
                        fresh--;
                    } 
                }
            }
            if(isFresh) time++;
        }
        return fresh == 0 ? time : -1;
    }
}