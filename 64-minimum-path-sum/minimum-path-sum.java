class Solution {
    public int minPathSum(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        Integer[][] cache = new Integer[r][c];
        return helper(r-1,c-1,obstacleGrid,cache);
    }

    private int helper(int r,int c,int[][] obstacleGrid,Integer[][] cache){
        if(r<0 || c<0 ) return 200*200;
        if(r==0 && c==0) return obstacleGrid[r][c];
        if(cache[r][c] != null) return cache[r][c];
        int l = obstacleGrid[r][c]+helper(r,c-1,obstacleGrid,cache);
        int u = obstacleGrid[r][c]+helper(r-1,c,obstacleGrid,cache);
        return cache[r][c]=Math.min(l,u);
    }
}