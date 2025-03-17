class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i=0;i<=amount;i++){
          if(i%coins[0]==0) dp[i]= i/coins[0];
          else dp[i] = 100000;
        }
        for(int idx=1;idx<coins.length;idx++){
            int[] temp = new int[amount+1];
            for(int tar=1;tar<=amount;tar++){
                int np=dp[tar];
                int p=100000;
                if(tar>=coins[idx]){
                    p=1+temp[tar-coins[idx]];
                }
                temp[tar]=Math.min(p,np);
            }
            dp=temp;
        }
        return dp[amount] >= 100000 ? -1 : dp[amount];
    }
}  