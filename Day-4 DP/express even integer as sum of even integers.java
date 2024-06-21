import java.util.*;
public class MyClass {
    static int count(int n){
        int dp[]=new int[n+1];
        dp[2]=1;
        for(int i=4;i<=n;i+=2){
            dp[i]=dp[i-2]*2;
        }
        return dp[n];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(count(n));
    }
}
