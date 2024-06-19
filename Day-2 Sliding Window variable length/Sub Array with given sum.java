import java.util.*;
public class MyClass {
   static void findSubArray(int[] a,int n,int x){
       int l=0,r=0,sum=a[l];
       while(l<n && r<n){
           if(sum==x){
               System.out.println("Found At: "+l+" "+r);
               break;
           }
           if(sum<x){
               r++;
               sum+=a[r];
           }else{
               sum-=a[l];
               l++;
           }
       }
       if(sum!=x)
       System.out.println("Not Found");
    }
    static void findSubArray1(int[] a,int n,int x){
        int i=0,j=0;
        for(i=0;i<n;i++){
            int sum=0;
            for(j=i;j<n;j++){
                sum+=a[j];
                if(sum==x){
                    System.out.println("Found At: "+i+" "+j);
                    break;
                }
            }
        }
       if(i>n && j>n)
       System.out.println("Not Found");
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        findSubArray1(arr,n,k);
    }
}
