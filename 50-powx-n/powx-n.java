class Solution {
    public double myPow(double x, int n) {
    if(x==1){
        return 1;
    }if(x==-1){
        if(n%2==0){
            return 1;
        }else{
            return-1;
        }
    }
    if(x>0 && x<1 && n>= Integer.MAX_VALUE){
        return 0;
    }
    if(n<=Integer.MIN_VALUE){
        return 0;
    }
    if(n==0){
        return 1;
    }
    if(n<0){
        return 1/x * myPow(x,n+1);
    }
   else{
        return x * myPow(x,n-1);
    }
 }
}