class Solution {
    public int totalNQueens(int n) {
        int ans=0;
        boolean[][] board = new boolean[n][n];
        for(int col=0;col<n;col++){
            board[0][col]=true;
            ans+=helper(n-1,1,board,n);
            board[0][col]=false;
        } 
        return ans;
    }
    public int helper(int queen,int row,boolean[][] board,int n){
        if(row==n){
            if(queen==0){
                return 1;
            }else{
                return 0;
            }
        }
        int ans=0;
        for(int col=0;col<n;col++){
            if(isPossible(board,n,row,col)){
            board[row][col]=true;
            ans+=helper(queen-1,row+1,board,n);
            board[row][col]=false;
            }
        }
        return ans;
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
