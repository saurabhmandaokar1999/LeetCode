class Solution {
    public void solveSudoku(char[][] board) {
       solve(0,0,board);
    }
    public boolean solve(int row, int col, char[][] board){
        if(row > 8 ) return true;
        if(col == 9){
            return solve(row+1, 0, board);
        }
        if(board[row][col] != '.'){
            return solve(row, col+1, board);
        }
        for(char num = '1'; num <= '9'; num++){
            if(isValid(board, row, col, num)){
                board[row][col] = num;
                if(solve(row, col+1, board)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
      private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) return false;
        }
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }
}