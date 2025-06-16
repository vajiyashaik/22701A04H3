import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int temp=num,rev=0;
        while(num!=0){
            int digit=num%10;
             rev=(rev*10)+digit;
            num=num/10;
        }
        System.out.println("reverse of "+temp+":"+rev);
        if(rev==temp){
            System.out.println("Palindrome");
        }else{
                        System.out.println("not Palindrome");

        }
        
    }
}
