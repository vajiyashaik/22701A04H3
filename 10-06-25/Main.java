import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int oper1=0;
		int oper2=0;
		int count=0;
		while(n!=1){
		    int f=HighestFactor(n);
		     n=n/f;
		    oper1++;
		    if(n!=1){
		        n=n-1;
		        oper1++;
		    }
		}
		while(n!=1){
		   n=n-1;
		    oper2++;
		    if(n!=1){
		        int f=HighestFactor(n);
		        n=n/f;
		        oper2++;
		    }
		}
		count=Math.min(oper1,oper2);
		System.out.println(count);
	}
	public static int HighestFactor(int num){
	    int m=1;
	    for(int i=2;i<=num/2;i++){
	        if(num%i==0){
	            m=i;
	        }
	    }
	    return m;
	}
}