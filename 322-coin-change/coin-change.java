class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int i=0;i<=amount;i++){
          if(i%coins[0]==0) dp[0][i]= i/coins[0];
          else dp[0][i] = 100000;
        }
        for(int idx=1;idx<coins.length;idx++){
            for(int tar=1;tar<=amount;tar++){
                int np=dp[idx-1][tar];
                int p=100000;
                if(tar>=coins[idx]){
                    p=1+dp[idx][tar-coins[idx]];
                }
                dp[idx][tar]=Math.min(p,np);
            }
        }
        return dp[coins.length - 1][amount] >= 100000 ? -1 : dp[coins.length - 1][amount];
    }
}  