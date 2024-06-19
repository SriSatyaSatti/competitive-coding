import java.util.*;
public class MyClass {
   static int findSubArray(int[] a,int n,int x){
       int l=0,r=0,min=n+1,sum=0;
       while(l<n && r<n){
           while(sum<=x && r<n){
               sum+=a[r];
               r++;
           }
           min=Math.min(min,r-l+1);
           while(sum>x && l<n){
               sum-=a[l];
               l++;
               min=Math.min(min,r-l+1);
           }
       }
       return min;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(findSubArray(arr,n,k));
    }
}
