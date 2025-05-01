//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            int x = V;
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());

            int[][] edges = new int[E][2];
            for (int i = 0; i < E; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
                adj.get(edges[i][0]).add(edges[i][1]);
            }

            ArrayList<Integer> res = new Solution().topoSort(V, edges);

            if (check(adj, x, res) == true)
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }

    static boolean check(ArrayList<ArrayList<Integer>> adj, int V,
                         ArrayList<Integer> res) {

        if (V != res.size()) return false;

        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res.get(i)] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : adj.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // Use khan's algo to solv etopoo sort (BFS)
        int[] idg = new int[V];
        List<List<Integer>> adj = adjMaker(V,edges,idg);
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for (int u = 0; u < V; u++) {
          if (idg[u] == 0) q.offer(u);
        }
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            
            for(int i : adj.get(node)){
                idg[i]--;
                if(idg[i]==0){
                    q.offer(i);
                }
            }
        }
        return ans;
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