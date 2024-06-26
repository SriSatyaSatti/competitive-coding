import java.util.*;
public class MyClass {
    static int minCost(int n,int k,int[] a){
        int dp[]=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0)
                min=Math.min(min,Math.abs(a[i]-a[i-j])+dp[i-j]);
            }
            dp[i]=min;
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
