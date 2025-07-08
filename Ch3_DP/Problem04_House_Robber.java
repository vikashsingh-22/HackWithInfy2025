package Ch3_DP;

//Level :-Medium 
//Leetcode problem Link:-https://leetcode.com/problems/house-robber/description/
public class Problem04_House_Robber {

    public static int houseRobber(int[] nums) {
	        int n = nums.length;
	
	        if (n < 2) return nums[0];
	
	        int[] dp = new int[n+1];
	
	        dp[0] = nums[0];
	        dp[1] = Math.max(nums[0], nums[1]);
	
        for (int i = 2; i <= n; i++) {
	            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
	        }
	
	        return dp[n - 1];
	    }


public static void main(String[] args) {
    int[] nums={1,2,3,1 };

    System.out.println(houseRobber(nums));
}
    
}
