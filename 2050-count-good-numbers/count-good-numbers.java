class Solution {
    public static final long modulo = 1000000007;
    public int countGoodNumbers(long n) {
        long ans = 0, even = 0, odd = 0;
        if(n % 2 == 0){
            even = n/2;
            odd = n/2;
        }else{
            even = (n/2)+1;
            odd = n/2;
        }
        return (int)(power(5,even) * power(4,odd)%modulo);
    }
    public long power(long base , long exponent){
        if(exponent == 0) return 1;
        long answer = power(base,(exponent/2))%modulo;
        if(exponent % 2 == 0){
            return answer*answer % modulo;
        }else{
            return base*answer*answer % modulo;
        }
    }
}