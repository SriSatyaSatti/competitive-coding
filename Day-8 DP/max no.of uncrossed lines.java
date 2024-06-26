import java.util.*;
public class MyClass {
    static int maxLine(int[] a,int[] b,int n){
        int dp[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(a[i-1]==b[j-1])
                dp[i][j]=dp[i-1][j-1]+1;
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][n];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(maxLine(a,b,n));
    }
}
