class Solution {
    public int findCircleNum(int[][] isConnected) {
        int size = isConnected.length;
        int count = 0;
        boolean[] vis = new boolean [size];
        for(int i = 0 ; i < size ; i++){
            if(!vis[i]){
                dfs(i,isConnected,vis,size);
                count++;
            }
        }
        return count;
    }
    private void dfs(int idx,int[][] isConnected,boolean[] vis,int size){
        vis[idx] = true;
        for(int i = 0; i < size; i++){
            if(isConnected[idx][i] == 1 && vis[i]==false){
                dfs(i,isConnected,vis,size);
            }
        }
    }
}