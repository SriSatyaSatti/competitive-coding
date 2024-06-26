import java.util.*;
public class MyClass {
    static int minCost(int n,int k,int[] a){
        int dp[]=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(a[1]-a[0]);
        for(int i=2;i<n;i++){
            dp[i]=Math.min(Math.abs(a[i]-a[i-1])+dp[i-1],Math.abs(a[i]-a[i-2])+dp[i-2]);
        }
        return dp[n-1];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int grid[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                height[i][j]=sc.nextInt();
            }
        }
        System.out.println(minCost(height,m,n));
    }
}
