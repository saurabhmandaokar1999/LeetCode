class Solution {
    private int ans=0;
    public int totalNQueens(int n) {

        boolean[][] board = new boolean[n][n];
        for(int col=0;col<n;col++){
            board[0][col]=true;
            helper(n-1,1,board,n);
            board[0][col]=false;
        } 
        return ans;
    }
    public void helper(int queen,int row,boolean[][] board,int n){
        if(row==n){
            ans++;
            return;
        }
        for(int col=0;col<n;col++){
            if(isPossible(board,n,row,col)){
                board[row][col]=true;
                helper(queen-1,row+1,board,n);
                board[row][col]=false;
            }
        }
    }
    public boolean isPossible(boolean[][] board,int n,int row,int col){
        for(int i=row;i>=0;i--){
            if(board[i][col]==true) return false;
        }
        int r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==true) return false;
            r--;
            c--;
        }
        r=row;
        c=col;
        while(r>=0 && c<n){
            if(board[r][c]==true) return false;
            r--;
            c++;
        }
        return true;
    }
}
