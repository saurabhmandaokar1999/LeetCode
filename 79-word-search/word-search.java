class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean ans = false;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean vis[][] = new boolean[m][n];
                   if(word.length() > 1)ans = helper(board, word, i, j,"", m, n,0,vis);
                   else return board[i][j] == word.charAt(0);
                   if(ans) return ans;
                }
            }
        }
        return ans;
    }
    public boolean helper(char[][] board, String word, int row , int col, String s,int m, int n, int strInt,boolean vis[][]){
        if(row < 0 || col < 0 || row >= m || col >= n) return false;
        if(word.equals(s)) return true;

        if(board[row][col] != word.charAt(strInt)) return false;
        if(vis[row][col]) return false;
        vis[row][col] = true;
        boolean res =  helper(board, word, row-1, col, s+board[row][col], m, n,strInt+1,vis) ||
        helper(board, word, row+1, col, s+board[row][col], m, n,strInt+1,vis) ||
        helper(board, word, row, col+1, s+board[row][col], m, n,strInt+1,vis) ||
        helper(board, word, row, col-1, s+board[row][col], m, n,strInt+1,vis);
        vis[row][col] = false;
        return res;

    }
}