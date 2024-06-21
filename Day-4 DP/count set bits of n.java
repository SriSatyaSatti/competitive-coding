import java.util.*;
public class MyClass {
    static int countSetBits(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i]=dp[i/2]+(i%2);
        }
        return dp[n];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(countSetBits(n));
    }
}
