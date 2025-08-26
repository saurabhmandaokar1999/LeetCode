class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double d=0;
        int a=0;
        for(int[] dim:dimensions){
            double cd=Math.pow((dim[0]*dim[0])+(dim[1]*dim[1]),0.5);
            int ca = dim[0]*dim[1];
            if(cd>d){
                d=cd;
                a=ca;
            }
            if(cd==d){
                a=Math.max(a,ca);
            }
        }
        return a;
    }
}