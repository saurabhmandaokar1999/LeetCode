class Solution {
    public boolean isValidSudoku(char[][] board) {
         for(int i = 0 ; i < 9 ; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                if(!isValid(i, j, board, board[i][j])){
                    return false;
                }
            }
         }
         return true;
    }
    public boolean isValid(int row, int col, char[][] board, char num){
        for(int i = 0; i< 9 ; i++){
            //for row
            if(i != col && board[row][i] == num) return false;
            //for col
            if(i != row && board[i][col] == num) return false;
        }
        int startRow = (row/3) * 3;
        int startCol = (col/3) * 3;
        for(int i = startRow ; i < startRow+3 ; i++){
            for(int j = startCol; j< startCol+3; j++){
                if(i == row && j == col) continue;
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}