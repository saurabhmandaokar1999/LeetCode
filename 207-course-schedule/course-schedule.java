class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //Make a graph
        List<List<Integer>> adj = new ArrayList<>();
        int[] idg = new int[numCourses];
        helper(numCourses,prerequisites,adj,idg);
        Queue<Integer> q = new LinkedList<>();
        int count=0;
        for(int i =0;i<numCourses;i++){
            if(idg[i]==0) q.offer(i);
        }
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int i: adj.get(node)){
                idg[i]--;
                if(idg[i]==0) q.offer(i);
            }
        }
        return count==numCourses;
    }
    private void helper(int numCourses, int[][] prerequisites,List<List<Integer>> adj,int[] idg){
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[] i : prerequisites){
            adj.get(i[0]).add(i[1]);
            idg[i[1]]++;
        }
    }
}