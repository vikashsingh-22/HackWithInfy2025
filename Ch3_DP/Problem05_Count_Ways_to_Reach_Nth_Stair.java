package Ch3_DP;

public class Problem05_Count_Ways_to_Reach_Nth_Stair {

    public static int coutWaysToReachNthStair(int n){
        
        if(n < 0) return 0;
        if(n==0) return 1;
        if(n ==1 || n==2) return n;
       

        int dp[] = new int[n+1];

        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        for(int i=4; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=-3;

        System.out.println(coutWaysToReachNthStair(n));
    }
    
}
