package Ch2_Recursion;

public class Problem2_ClimbingStairs {

    public static int climbingStairs(int n){

        if(n==0 || n==1 || n==2) return n;

        return climbingStairs(n-1)+climbingStairs(n-2);

    }
    public static void main(String[] args) {
        int n=4;
        
        System.out.println(climbingStairs(n));


    }

    
}
