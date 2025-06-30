class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        String[][] board = new String[n][n];
        for(String[] str : board){
            Arrays.fill(str,".");
        }
        helper(n,ans,board,0);
        return ans;
    }
    public void helper(int n,List<List<String>> ans, String[][] board,int col){
        if(col == n){
                List<String> an = new ArrayList<String>();
                for(String[] str : board){
                    StringBuilder sb = new StringBuilder();
                    for(int i=0;i<n;i++){
                        sb.append(str[i]);
                    }
                    an.add(sb.toString());
                }
                ans.add(an);
        }
        for(int row=0;row<n;row++){
            if(isSafe(board,row,col,n)){
                board[row][col]="Q";
                helper(n,ans,board,col+1);
                board[row][col]=".";
            }
        }
    }
    public boolean isSafe(String[][] board,int row ,int col,int n){
        int tempR= row;
        int tempC= col;
        while(tempR>0 && tempC>0){
            tempR=tempR-1;
            tempC=tempC-1;
            if(board[tempR][tempC]=="Q"){
                return false;
            } 
        }
        tempR=row;
        tempC=col;
        while(tempC>0){
            tempC=tempC-1;
            if(board[tempR][tempC]=="Q"){
                return false;
            }
        }
        tempR=row;
        tempC=col;
        while(tempR<n-1 && tempC>0){
            tempR=tempR+1;
            tempC=tempC-1;
           if(board[tempR][tempC]=="Q"){
                return false;
            }
        }
        return true;
    }
}