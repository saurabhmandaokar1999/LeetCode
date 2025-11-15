class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList();  
        char [][] board = new char[n][n];
        for(char[] arr: board){
            Arrays.fill(arr,'.');
        }
        placeQueen(0, n, n, ans, board);
        return ans;
    }
    public void placeQueen(int row, int q, int n, List<List<String>> ans, char [][] board){
        if(row >=n ){
            if(q==0){
                ansHelper(board, ans);
            }
            return;
        }
        for(int i=0; i<n; i++){
            if(canPlace(board, row, i, n)){
                board[row][i] ='Q';
                placeQueen(row+1, q-1, n, ans, board);
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
    public boolean canPlace(char[][] board, int row, int col,int n){
        int r = row;
        int c = col;
        while(r >=0 && c >=0){
            if(board[r][c] == 'Q') return false;
            r--;
        }
        r = row;
        c = col;
        while(c >=0 && r >=0){
            if(board[r][c] == 'Q') return false;
            c--;
            r--;
        }
        r = row;
        c = col;
        while(r >=0 && c < n ){
            if(board[r][c] == 'Q') return false;
            c++;
            r--;
        }
        return true;
    }
}
