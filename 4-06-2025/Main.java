import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
       printRange(start,end);
    }
    public static void printRange(int start,int end){
        if(start>end) return ;
        System.out.print(start+" ");
        printRange(start+1,end);
        
    }
}