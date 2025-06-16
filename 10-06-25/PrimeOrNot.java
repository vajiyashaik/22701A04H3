import java.util.Scanner;
class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        System.out.println(count==0?n+":prime number":n+": Not a prime Number");
    }
}