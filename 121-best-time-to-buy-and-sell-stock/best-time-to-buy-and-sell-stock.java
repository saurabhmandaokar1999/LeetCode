class Solution {
    public int maxProfit(int[] prices) {
        //assign first varible as buy price
        int buy = prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                //change buying price only if the current number is lesser than buying price
                buy=prices[i];
            }else if(prices[i]-buy>profit){
                //change profit when only it is greater
                profit=prices[i]-buy;
            }

        }
        return profit;
    }
}