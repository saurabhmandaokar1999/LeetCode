class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0 ; i< n ; i++){
            HashSet<Integer> set1 = new HashSet();
            HashSet<Integer> set2 = new HashSet();
            for(int j = 0 ; j< n; j++){
                set1.add(matrix[i][j]);
                set2.add(matrix[j][i]);
                if(j == n-1){
                    if(set1.size() != n || set2.size() != n) return false;
                }
            }
        }
        return true;
    }
}