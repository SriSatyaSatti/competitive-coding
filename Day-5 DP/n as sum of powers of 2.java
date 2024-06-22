import java.util.*;
public class MyClass {
    static int minCost( int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i*=2){
            for(int j=i;j<=n;j++){
                dp[j]+=dp[j-i];
            }
        }
        return dp[n];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(minCost(n));
    }
}
