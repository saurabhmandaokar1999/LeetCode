class Solution {
    public static class Pair{
        int x=0;
        int y=0;
        public Pair(int x , int y){
            this.x=x;
            this.y=y;
        }
    }
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int fresh=0;
        int time=0;
        Queue<Pair> q = new ArrayDeque<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j));
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int[] mr = {0,1,0,-1};
        int[] mc = {-1,0,1,0};
        while(!q.isEmpty()){
            ++time;
            int len = q.size();
            for(int a=0;a<len;a++){
                Pair p = q.poll();
                for(int c=0;c<4;c++){
                    int cr=p.x+mr[c];
                    int cc=p.y+mc[c];
                    if(cr>=0 && cr<row && cc>=0 && cc<col){
                        if(grid[cr][cc]==2 || grid[cr][cc]==0) continue;
                        else{
                            grid[cr][cc]=2;
                            q.offer(new Pair(cr,cc));
                            fresh--;
                        }
                    }
                }
            }
        }
        return fresh==0 ? time-1:-1;
    }
}