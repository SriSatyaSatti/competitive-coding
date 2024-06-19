import java.util.*;
public class MyClass {
   static void findSubArray(int[] a,int n,int x){
       HashMap<Integer,Integer> h=new HashMap<>();
       int sum=0,i=0;
       for(i=0;i<n;i++){
           sum+=a[i];
           int k=sum-x;
           if(k==0){
               System.out.println("0 "+i);
               break;
           }else{
               if(!h.containsKey(k)){
                   h.put(sum,i);
               }else{
                   System.out.println((h.get(k)+1)+" "+i);
                   break;
               }
           }
       }
       if(i>=n)
       System.out.println("--");
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        findSubArray(arr,n,k);
    }
}
