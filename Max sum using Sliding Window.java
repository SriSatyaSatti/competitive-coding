import java.util.*;
public class MyClass {
    static int maxSum1(int[] a,int n,int k){
        int max=0;
        for(int i=0;i<n-k+1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=a[j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
    static int maxSum2(int a[],int n,int k){
        int max=0,sum=0,c=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        max=sum;
        for(int i=k;i<n;i++){
            sum=sum-a[c]+a[i];
             max=Math.max(max,sum);
            c++;
        }
        return max;
    }
   static int[] maxSumElements(int[] a,int n,int k){
       int ans[]=new int[k];
        int max=0;
        for(int i=0;i<n-k+1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=a[j];
            }
            if(max<sum){
                sum=max;
                int c=0;
                for(int j=i;j<i+k;j++){
                    ans[c++]=j-1;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
      System.out.println(maxSum1(arr,n,k));
      System.out.println(maxSum2(arr,n,k));
      int ans[]=new int[k];
      ans=maxSumElements(arr,n,k);
      for(int i=0;i<k;i++){
          System.out.print(ans[i]+" ");
      }
    }
}
