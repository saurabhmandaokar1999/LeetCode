class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int money=0;
        for(int i=1;i<=n;i++){
            if((i-1)%7==0){
                money=((i-1)/7)+1;
                sum=sum+money;
            }
            else{
                money++;
                sum=sum+money;
            }
        }
        return sum;
    }
}