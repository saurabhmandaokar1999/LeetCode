class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
       return helper(x,(long)n);
    }
    double helper(double x, long n){
        if(n==0) return 1;
        if(n<0){
            n=-n;
            x=1/x;
        }
        if(n%2==0){
            return helper(x*x,n/2);
        }else{
            return x*helper(x*x,n/2);
        }
    }
}