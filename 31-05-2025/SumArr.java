import java.util.Scanner;
public class SumArr{

	public static void main(String[] args) {
	  int[] arr={1,2,3,4,5,6,6};
	  int sum=0;
	  for(int i=0;i<arr.length;i++){
	      sum+=arr[i];
	  }
	  System.out.println("Sum of elements  in an array are "+sum);
	   
	}
}