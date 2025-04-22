class Solution {
    public int findCircleNum(int[][] isConnected) {
        //convert to adj list from matrix
        int len = isConnected.length;
        boolean[] vis = new boolean[len];
        int ans = 0;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<len;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i =0;i<len;i++){
            for(int j =0;j<len;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        for(int i=0;i<len;i++){
            if(vis[i]==false){
                ans++;
                dfs(adj,i,vis);
            }
        }
        return ans;
    }
    public void dfs(List<List<Integer>> adj,int idx,boolean[] vis){
        for(Integer i : adj.get(idx)){
            if(vis[i]==false){
                vis[i]=true;
                dfs(adj,i,vis);
            }
        }
    }
}