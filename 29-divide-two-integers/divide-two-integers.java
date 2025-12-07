class Solution {
    public int divide(int d1, int d2) {
        long count = 0;
        boolean isNeg = false;
        long dividend = (long)d1;
        long divisor = (long)d2;
        if(dividend<0){
            dividend = 0-dividend;
            isNeg = !isNeg;
        }
         if(divisor < 0){
            divisor = 0-divisor;
            isNeg =!isNeg;
        }
        int temp = 0;
        while(dividend >= divisor){
            while(dividend >= (Math.pow(2,temp)*divisor)){
                temp++;
            }
            dividend -= Math.pow(2,temp-1)*divisor;
            count += Math.pow(2,temp-1);
            temp=0;
        }
        if(isNeg)  count = 0-count;

        if(count <=Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(count >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)count;
    }
}