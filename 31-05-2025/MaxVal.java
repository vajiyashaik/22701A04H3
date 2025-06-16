import java.util.Scanner;
public class MaxVal{

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the length of the array:");
	   int n=sc.nextInt();
	  int[] arr= new int[n];
	  System.out.println();
	  System.out.println("Entet the elements in an array:");
	  for(int i=0;i<n;i++){
	      int val=sc.nextInt();
	      arr[i]=val;
	      
	  }
	  int max=arr[0];
	  for(int i=0;i<arr.length;i++){
	      if(max<arr[i]) max=arr[i];
	  }
	  System.out.println("Maximum no. in an array :"+max);
	  
	   
	}
}