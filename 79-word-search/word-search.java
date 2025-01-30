class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wrd = word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==wrd[0] && helper(i,j,wrd,board,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean helper(int i,int j,char[] wrd,char[][] board,int idx){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=wrd[idx]){
            return false;
        }
        if(idx==wrd.length-1) return true;

        char temp = board[i][j];
        board[i][j]='*';
        boolean ans = helper(i+1,j,wrd,board,idx+1)||
                      helper(i-1,j,wrd,board,idx+1)||
                      helper(i,j+1,wrd,board,idx+1)||
                      helper(i,j-1,wrd,board,idx+1);
        board[i][j]=temp;
        return ans;
    }
}