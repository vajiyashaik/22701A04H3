import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int sum=0;
     while(num!=0){
         int digit=num%10;
         sum=sum+digit;
         num=num/10;
     }
     System.out.println("sum of digits in a"+num+":"+sum);
     System.out.println((sum%2==0)?"Even sum":"Odd sum");
        
    }
}