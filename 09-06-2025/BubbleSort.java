import java.util.Scanner;
class BubbleSort{
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
            boolean isSwapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) break;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
        
    }
}
