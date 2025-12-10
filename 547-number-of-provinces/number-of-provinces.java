class Solution {
    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length;
        boolean[] vis = new boolean[len];
        int provinces = 0;
        for(int i = 0 ; i < len ; i++){
            if(!vis[i]){
                dfs(i, vis, isConnected, len);
                provinces++;
            }
        }
        return provinces;
    }
    public void dfs(int index, boolean[] vis, int[][] isConnected, int len){
        vis[index]=true;
        for(int j=0; j< len; j++){
            if(isConnected[index][j] == 1 && !vis[j]){
            dfs(j, vis, isConnected, len);
            }
        }
    }
}