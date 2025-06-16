import java.io.*;
public class Main
{
	public static void bubblesort(int arr[],int n) {
	    int i,j,temp;
	    boolean swapped;
	    for(i=0;i<n-1;i++){
	        swapped=false;
	        for(j=0;j<n-1;j++){
	            if (arr[j]>arr[j+1]){
	                temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	                swapped=true;
	            }
	        }
	        if (swapped==false)
	        break;
	    }
	}
	static void printArray(int arr[],int size){
	    int i;
	    for(i=0;i<size;i++)
	    System.out.print(arr[i]+"");
	}
	public static void main(String aegs[]){
	    int arr[]={64,34,25,12,21,11,90};
	    int n=arr.length;
	    bubblesort(arr,n);
	    System.out.println("sorted args:");
	    printArray(arr,n);
	}
}