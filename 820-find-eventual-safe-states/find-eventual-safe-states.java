class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
       List<List<Integer>> adj = new ArrayList<>();
       int len = graph.length;
       adjMaker(graph,len,adj);
       int[] check= new int[len];
       int[] vis = new int[len];
       int[] pVis = new int[len];
       for(int i =0;i<len;i++){
          if(vis[i]==0){
             dfs(adj,i,check,vis,pVis);
          }
       }
       List<Integer> ans = new ArrayList<>();
       for(int i=0;i<len;i++){
        if(check[i]==1){
            ans.add(i);
        }
       }
       return ans;
    }

    private boolean dfs(List<List<Integer>> adj,int node,int[] check,int[] vis,int[] pVis){
        vis[node]=1;
        pVis[node]=1;
        check[node]=0;
        for(int i : adj.get(node)){
            if(vis[i]==0){
                if(dfs(adj,i,check,vis,pVis)==true){
                    return true;
                }
            }else if(pVis[i]==1){
                return true;
            }
        }
        pVis[node]=0;
        check[node]=1;
        return false;
    }
    private void adjMaker(int[][] graph,int len,List<List<Integer>> adj){
        for(int i=0;i<len;i++){
            adj.add(new ArrayList<Integer>());
        }
        for (int u = 0; u < len; u++) {
            for (int v : graph[u]) {
                adj.get(u).add(v);
            }
        }
    }
}