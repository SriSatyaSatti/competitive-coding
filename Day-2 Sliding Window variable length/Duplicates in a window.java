import java.util.*;
public class MyClass {
    static Boolean duplicates(int[] a,int n,int k){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
        if(h.containsKey(a[i]) && i-h.get(a[i])+1<=k){
            System.out.println(i+" "+h.get(a[i]));
            return true;
        }
        h.put(a[i],i);
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(duplicates(arr,n,k));
    }
}
