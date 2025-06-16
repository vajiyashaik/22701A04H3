
import java.util.Arrays;
class DPTabulation
 {
    public static void main(String[] args) {
        long memo[]=new long[100];
        memo[0]=0;
        memo[1]=1;
        System.out.println(fibTabulation(50,memo));
         System.out.println(fibTabulation(20,memo));

    }
    public static long fibTabulation(long n,long[] memo){
        if(memo.length>=n){
            for(int i=2;i<=n;i++){
                long val=memo[i-1]+memo[i-2];
                memo[i]=val;
            }
             return memo[(int)n];
        }
       
        System.out.println("Insufficient memory");
        return -1;
        
}
}