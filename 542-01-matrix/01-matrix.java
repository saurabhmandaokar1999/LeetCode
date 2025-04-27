class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        int[][] vis = new int[m][n];
        Queue<Integer[]> q = new ArrayDeque<>();

        //Mark all the 0 as visited and add them to queue
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new Integer[]{i,j,0});
                    vis[i][j]=1;
                }
            }
        } 
        int[] delR = {-1,0,1,0};
        int[] delC = {0,1,0,-1};

        while(!q.isEmpty()){
            Integer[] temp=q.poll();
            Integer r = temp[0];
            Integer c = temp[1];
            Integer s = temp[2];
            ans[r][c]=s;
            for(int i=0;i<4;i++){
                int tr=r+delR[i];
                int tc=c+delC[i];
                if(tr>=0 && tr<m && tc>=0 && tc<n && vis[tr][tc]!=1 && mat[tr][tc]==1){
                    ans[tr][tc]=s+1;
                    vis[tr][tc]=1;
                    q.offer(new Integer[]{tr,tc,s+1});
                }
            }
        }
        return ans;
    }
}