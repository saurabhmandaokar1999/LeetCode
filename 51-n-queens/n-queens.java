class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList();  
        char [][] board = new char[n][n];
        boolean[] dp1 = new boolean[(2*n)+1];
        boolean[] dp2 = new boolean[(2*n)+1];
        boolean[] dp3 = new boolean[n];
        for(char[] arr: board){
            Arrays.fill(arr,'.');
        }
        placeQueen(0, n, n, ans, board,dp1, dp2, dp3);
        return ans;
    }
    public void placeQueen(int row, int q, int n, List<List<String>> ans, char [][] board, boolean[] dp1, boolean[] dp2, boolean[] dp3){
        if(row >=n ){
            if(q==0){
                ansHelper(board, ans);
            }
            return;
        }
        for(int i=0; i<n; i++){
            if((canPlace(board, row, i, n, dp1, dp2, dp3))){
                board[row][i] ='Q';
                dp3[i] = true;
                dp2[row+i] = true;
                dp1[n+row-i] = true;
                placeQueen(row+1, q-1, n, ans, board, dp1, dp2, dp3);
                dp3[i] = false;
                dp2[row+i] = false;
                dp1[n+row-i] = false;
                board[row][i] ='.';
            }
        }
    }
    public void ansHelper(char[][] board , List<List<String>> ans){
        List<String> curr = new ArrayList();
        for(char[] c : board){
            curr.add(new String(c));
        }
        ans.add(curr);
    }
    public boolean canPlace(char[][] board, int row, int col,int n, boolean[] dp1, boolean[] dp2, boolean[] dp3){
        if(dp3[col] || dp2[row+col] || dp1[n+row-col]) return false;
        return true;
    }
}
