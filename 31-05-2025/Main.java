import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int target=sc.nextInt();
	   int count=0;
	   int[] arr={1,2,3,4,4,5,6,6,6,6,4};
	   for(int i=0;i<arr.length;i++){
	       if(arr[i]==target){
	           count++;
	       }
	   }
	   System.out.println(target+"repeated for"+count+"times");
	}
}