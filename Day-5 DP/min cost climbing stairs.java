import java.util.*;
public class MyClass {
    static int minCost(int[] a, int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=a[0];
        for(int i=2;i<=n;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+a[i-1];
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(minCost(arr,n));
    }
}
