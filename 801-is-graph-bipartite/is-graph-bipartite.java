class Solution {
    public boolean isBipartite(int[][] graph) {
        int col[]  = new int[graph.length];
        Arrays.fill(col,-1);

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){
                q.add(i);
                col[i] = 0; // green

                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].length; j++){
                        int e = graph[curr][j];
                        if(col[e] == -1){
                            int nextCol = col[curr] == 0?1:0;
                            col[e] = nextCol;
                            q.add(e);
                        } else if(col[e] == col[curr]){
                            return false;
                        }
                    }
                }
            }
            
        }
        return true;
    }
}