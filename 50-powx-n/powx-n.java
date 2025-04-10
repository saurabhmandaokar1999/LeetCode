class Solution {
    public double myPow(double x, int n) {
        return powHelper(x,(long)n);
    }
    public double powHelper(double x,long n){
        if(n==0){
            return 1;
        }
        if(n<0){
            n=-n;
            x=1/x;
        }
        return (n%2==0)? powHelper(x*x,n/2):x*powHelper(x*x,(n)/2);
    }
}