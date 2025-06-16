import java.util.Scanner;
public class EvenCount{

	public static void main(String[] args) {
	  int[] arr={1,2,3,4,5,6,6};
	  int evenCount=0;
	  for(int i=0;i<arr.length;i++){
	      if(arr[i]%2==0) evenCount++;
	  }
	  System.out.println("Even numbers in an array are "+evenCount);
	   
	}
}