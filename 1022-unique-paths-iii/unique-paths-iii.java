class Solution {
    public int uniquePathsIII(int[][] grid) {
    int walkSquare = 0;
    int m = grid.length;
    int n = grid[0].length;
    int startRow = 0;
    int startCol=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==0) walkSquare++;
            if(grid[i][j]==1){
                startRow=i;
                startCol=j;
                walkSquare++;
               // grid[startRow][startCol]=3;
            }
        }
    }
    return helper(grid,startRow,startCol,walkSquare,m,n);
    }
    public int helper(int[][] grid,int row,int col,int walkSquare,int m,int n){
        if(row>=m || row<0 || col>=n || col<0) return 0; 

        if(grid[row][col]==2){
            if(walkSquare==0) return 1;
            else return 0;
        }
        if(grid[row][col]==-1 || grid[row][col]==3) return 0;
        
        grid[row][col]=3;
        walkSquare--;
        int down = helper(grid,row+1,col,walkSquare,m,n);
        int right = helper(grid,row,col+1,walkSquare,m,n);
        int up = helper(grid,row-1,col,walkSquare,m,n);
        int left = helper(grid,row,col-1,walkSquare,m,n);
        grid[row][col]=0;
        return down+right+up+left;
    }
}