import java.util.Scanner;
public class Sorted{
    public static boolean leftToR(int[] arr){
        boolean lrSorted;
        boolean isSorted=false;
	  int i;
	  for( i=0;i<arr.length-1;i++){
	     if((arr[i]<=arr[i+1])){
	         isSorted=true;
	     }else{
	         isSorted=false;
	         break;
	     }
	  }
	  if(isSorted==true){
	     return true;
	  }else{
	      	      return false;

	  }
	   
	}
    public static boolean rToL(int[] arr){
         boolean isSorted=false;
	  int i;
	  for( i=0;i<arr.length-1;i++){
	     if((arr[i]>=arr[i+1])){
	         isSorted=true;
	     }else{
	         isSorted=false;
	         break;
	     }
	  }
	  if(isSorted==true){
	      return true;
	  }else{
	      	     return false;

	  }
    }

	public static void main(String[] args) {
	  int[] arr={8,7,6,5,4,8};
	  if(leftToR(arr)==true||rToL(arr)==true){
	      System.out.println("Sorted");
	  }else{
	      	      System.out.println(" not Sorted");

	  }
	  
	   
	}
}