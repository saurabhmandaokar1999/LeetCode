class Solution {
    public int findCircleNum(int[][] isConnected) {
        int col = isConnected.length;
        int row = isConnected[0].length;
        boolean[] vis = new boolean[col];
        int count=0;
        //use dfs for this
        for(int i=0;i<row;i++){
            if(!vis[i]){
                dfs(isConnected,vis,col,i);
                count++;
            }
        }
        return count;
    }
    private void dfs(int[][] isConnected,boolean[] vis, int col,int i){
        vis[i] = true;
        for(int j=0;j<col;j++){
            if(!vis[j] && isConnected[i][j]==1){
                dfs(isConnected,vis,col,j);
            }
        }
    }
}