package Ch3_DP;

import java.util.Arrays;

//Ways to Reach the n'th Stair
//GFG :- https://www.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1

public class Problem02_Climbing_Stairs {

    public static int climbingStairs(int n){

        if(n <=2) return n;
        int dp[] =new int[n+1];
        
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        
        for(int i=3; i<=n; i++){
            dp[i]=dp[i-1] +dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n=4;
        
        System.out.println(climbingStairs(n));


    }
}
