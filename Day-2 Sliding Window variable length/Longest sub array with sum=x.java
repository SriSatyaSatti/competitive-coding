import java.util.*;
public class MyClass {
   static int findSubArray(int[] a,int n,int x){
       int l=0,r=0,max=0,sum=0;
       while(l<n && r<n){
           while(sum<x && r<n){
               sum+=a[r];
               r++;
           }
           if(sum==x)
           max=Math.max(max,r-l);
           while(sum>=x && l<n){
               sum-=a[l];
               l++;
               max=Math.max(max,r-l);
           }
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
        System.out.println(findSubArray(arr,n,k));
    }
}
