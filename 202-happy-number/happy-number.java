class Solution {
    public boolean isHappy(int n) {
        
        int s = n;
        int f = n;

        do{
            s = sumDigitSquare(s);
            f = sumDigitSquare(sumDigitSquare(f));
        }while(s!=f);

        if(s == 1){
            return true;
        }
        return false;
    }

    public int sumDigitSquare(int n){
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum += rem*rem;
            n/=10;
        }
        return sum;
    }
}