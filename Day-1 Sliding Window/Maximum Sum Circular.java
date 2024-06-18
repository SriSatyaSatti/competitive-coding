import java.util.*;
public class MyClass {
    static int maxSum(int a[],int n,int k){
        int max=0,sum=0,c=0,c1=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        max=sum;
        for(int i=k;i<n+k;i++){
            sum=sum-a[c++];
            if(i<n)
            sum+=a[i];
            else
            sum+=a[c1++];
             max=Math.max(max,sum);
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
      System.out.println(maxSum(arr,n,k));
    }
}
