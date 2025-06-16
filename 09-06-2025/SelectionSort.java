import java.util.Scanner;
class SelectionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
   Sort(arr);
   
     
    }
    public static void Sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
           int minInd=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                     minInd=j;
                }
            }
           int temp=arr[i];
           arr[i]=arr[minInd];
           arr[minInd]=temp;
           
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
        
    }
}
