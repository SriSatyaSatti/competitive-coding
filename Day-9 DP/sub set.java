import java.util.*;
public class MyClass {
    static Boolean isSubset(int[] M,int n,int sum){
        boolean[][] dp=new boolean[n+1][sum+1];
        for(int i=1;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(j>=M[i-1])
                dp[i][j]=(dp[i-1][j] || dp[i-1][j-M[i-1]]);
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sc.nextInt();
        int M[]=new int[n];
        for(int i=0;i<n;i++){
            M[i]=sc.nextInt();
        }
        System.out.println(isSubset(M,n,sum));
    }
}