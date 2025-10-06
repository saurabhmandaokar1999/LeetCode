//{
    //There are 2 approach I can think 
    // DFS traversal and maintain max value in that traversal
    //after reaching end return max value found in that
    //and return min of max value 
    //Also because of bias thinking I know we have to apply binary search
    //ans also the fact that 0 <= grid[i][j] < n2
    //this is one of the condition.
//}
class Solution {
    public int swimInWater(int[][] grid) {
        int len = grid.length;
        int l = 0;
        int h = (len*len)-1;
        int ans = h+1 ;
        while(h>=l){
            int[][] vis = new int[len][len];
            int mid = (l+h)/2;
            if(dfs(grid,0,0,len-1,vis,mid)){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
    public boolean dfs(int[][] grid,int row,int col,int n,int[][] vis,int curr){
        if(row < 0 || col < 0 || row > n || col > n || vis[row][col]==1 || grid[row][col]>curr) return false;
        if(row == n && col == n) return true;

        vis[row][col] = 1;
        
        boolean up = dfs(grid,row-1,col,n,vis,curr);
        if(up) return up;
        boolean down = dfs(grid,row+1,col,n,vis,curr);
        if(down) return down;
        boolean left = dfs(grid,row,col-1,n,vis,curr);
        if(left) return left;
        boolean right = dfs(grid,row,col+1,n,vis,curr);
        return right;
        //return up || right || left || down;
    }
}