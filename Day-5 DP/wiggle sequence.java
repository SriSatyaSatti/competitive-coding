import java.util.*;
public class MyClass {
    static int wiggle(int[] a,int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        int lp=0,ln=0;
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                lp=i;
                dp[i]=1+dp[ln];
            }else if(a[i]<a[i-1]){
                ln=i;
                dp[i]=1+dp[lp];
            }else{
                dp[i]=Math.max(dp[lp],dp[ln]);
            }
        }
        return dp[n-1];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(wiggle(arr,n));
    }
}
