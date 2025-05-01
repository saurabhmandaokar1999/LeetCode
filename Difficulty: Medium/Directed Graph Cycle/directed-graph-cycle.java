//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            int[][] edges = new int[E][2];
            for (int i = 0; i < E; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.isCyclic(V, edges);
            System.out.println(ans ? "true" : "false");
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        int[] idg = new int[V];
        List<List<Integer>> adj = adjMaker(V,edges,idg);
        int count =0;
        Queue<Integer> q = new LinkedList<>();
        
        for (int u = 0; u < V; u++) {
          if (idg[u] == 0) q.offer(u);
        }
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            
            for(int i : adj.get(node)){
                idg[i]--;
                if(idg[i]==0){
                    q.offer(i);
                }
            }
        }
        return count!=V;
    }
    private static List<List<Integer>> adjMaker(int V, int[][] edges,int[] idg){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ;i<V ; i++){
            //Add list for each vertices
            adj.add(new ArrayList<Integer>());
        }
        for(int[] i : edges){
            adj.get(i[0]).add(i[1]);
            idg[i[1]]++;
        }
        return adj;
    }
}