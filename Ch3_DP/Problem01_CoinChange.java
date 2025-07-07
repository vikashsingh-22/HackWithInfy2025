package Ch3_DP;

public class Problem01_CoinChange {

    public static int CoinChange(int[] coins , int amount){
       
       int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int i=0; i<coins.length; i++) {
            int coin=coins[i];
            for (int j = coin; i <=amount; i++) {
                dp[j] += dp[j - coin];
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins={1, 2, 3};
        int amount=4;

        System.out.println(CoinChange(coins, amount));
    }

}
