import java.util.*;
public class MyClass {
    static int[] countingBits(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i]=dp[i/2]+(i%2);
        }
        return dp;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans[]=new int[n+1];
        ans=countingBits(n);
        for(int i=0;i<=n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
