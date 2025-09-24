class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] c : board){
            Arrays.fill(c,'.');
        }
        for(int col=0;col<n;col++){
            board[0][col]='Q';
            helper(n-1,1,n,board,ans);
            board[0][col]='.';
        }
        return ans;
    }
    public void helper(int queen,int row,int n,char[][] board,List<List<String>> ans){
        if(row==n){
            if(queen==0){
                List<String> temp = getString(board,n);
                ans.add(temp);
                return;
            }
            else return;
        }
        for(int col=0;col<n;col++){
            boolean canPlace = canQueenBePlaced(board,row,col,n);
            if(canPlace){
                board[row][col]='Q';
                helper(queen-1,row+1,n,board,ans);
                board[row][col]='.';
            }
        }
    }
    public boolean canQueenBePlaced(char[][] board,int row,int col,int n){
        for(int i=row;i>=0;i--){
            if(board[i][col] =='Q') return false;
        }
        int r = row;
        int c = col;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q') return false;
            r--;
            c--;
        }
        r = row;
        c = col;
        while(r>=0 && c<n){
            if(board[r][c]=='Q') return false;
            r--;
            c++;
        }
        return true;
    }
    public List<String> getString(char[][] board,int n){
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(board[i][j]);
            }
            list.add(sb.toString());
        }
        return list;
    }
}