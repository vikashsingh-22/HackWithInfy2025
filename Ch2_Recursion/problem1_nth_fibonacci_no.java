package Ch2_Recursion;

public class problem1_nth_fibonacci_no {
    
    public static int fibonacci(int n){
        if(n==0) return 0;
        if( n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {

        int n=100;
        System.out.println(fibonacci(n));
        
    }
    
}
