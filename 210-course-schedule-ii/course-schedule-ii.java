class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] idg = new int[numCourses];
        helper(numCourses,prerequisites,adj,idg);
        Queue<Integer> q = new LinkedList<>();
        int[] ans = new int[numCourses];
        int j =0;
        for(int i=0;i<numCourses;i++){
            if(idg[i]==0) q.offer(i);
        }
        while(!q.isEmpty()){
            int node = q.poll();
           ans[j++] = node;
            for(int i: adj.get(node)){
                idg[i]--;
                if(idg[i]==0) q.offer(i);
            }
        }
        if(j!=numCourses) return new int[0];
        return ans;
    }
    private void helper(int numCourses, int[][] prerequisites,List<List<Integer>> adj,int[] idg){
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[] i : prerequisites){
            adj.get(i[1]).add(i[0]);
            idg[i[0]]++;
        }
    }
}