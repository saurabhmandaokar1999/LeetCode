class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int next[] = new int[n];
        for(int j=0;j<n;j++){
            next[j] = matrix[n-1][j];
        }
        for(int i=n-2;i>=0;i--){
            int cur[] = new int[n];
            for(int j=0;j<n;j++){
                int q1 = j==0 ? 1000001:next[j-1];
                int q2 = next[j];
                int q3 = j==n-1 ? 1000001:next[j+1];
                cur[j] = matrix[i][j] + Math.min(q1,Math.min(q2,q3));
            }
            next = cur;
        }
        int mini = next[0];
        for(int j=1;j<n;j++){
            mini = Math.min(mini,next[j]);
        }
        return mini;
    }
}