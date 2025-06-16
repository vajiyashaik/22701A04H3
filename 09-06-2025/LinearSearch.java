import java.util.Scanner;
class LinearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
      int index=Search(arr,target);
      System.out.print(index==-1?"target not found":"target is found at index "+index);
     
    }
    public static int Search(int[] arr,int t){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                return i;
            }
        }
        return -1;
   }
}
