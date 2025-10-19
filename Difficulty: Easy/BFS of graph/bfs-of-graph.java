class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        //BFS
        int len = adj.size();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int[] vis = new int[len];
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        vis[0]=1;
        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);
            for(int i : adj.get(curr)){
                if(vis[i]==0){
                    vis[i]=1;
                    q.offer(i);
                }
            }
        }
        return ans;
    }
}