import java.util.Scanner;
class BinarySearch
{
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
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==t)  return mid;
            else if(arr[mid]>t) right=mid-1;
            else left=mid+1;
        }
        return -1;
        
    }
}
