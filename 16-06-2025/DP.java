
import java.util.Arrays;
class DP {
    public static void main(String[] args) {
        long memo[]=new long[100];
        System.out.println(fibMemorization(6,memo));
    }
    public static long fibMemorization(long n,long[] memo){
        if(n==0 || n==1) return n;
        if(memo[(int)n]!=0){
            return memo[(int)n];
        }
        long val=fibMemorization(n-1,memo)+fibMemorization(n-2,memo);
        memo[(int) n]=val;
        return memo[(int) n];
    }
}