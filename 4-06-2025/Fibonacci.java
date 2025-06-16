import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
       System.out.println("fibonacci series at "+n+"is"+fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n==1|| n==0) return 1 ;
      int val=(fibonacci(n-1)+fibonacci(n-2));
      return val;
        
    }
}