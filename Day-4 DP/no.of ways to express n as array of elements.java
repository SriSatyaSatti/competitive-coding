import java.util.*;
public class MyClass {
    static int count(int[] a,int n,int k){
        int dp[]=new int[k+1];
        dp[0]=1;
        for(int i=1;i<=k;i++){
            for(int j=0;j<n;j++){
                if(i>=a[j])
                dp[i]+=dp[i-a[j]];
            }
        }
        return dp[k];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.print(count(arr,n,k));
    }
}
