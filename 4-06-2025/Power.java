import java.util.Scanner;
class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n and x values:");
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println("2 power 3 is:"+power(n,x));
        
    }
   public static int power(int n,int x){
        if(x==0){
            return 1;
        }
       int val= n*power(n,x-1);
       return val;
    }
}