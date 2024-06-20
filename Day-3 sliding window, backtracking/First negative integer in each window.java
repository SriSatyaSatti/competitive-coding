import java.util.*;
public class MyClass {
    static void firstNegative1(int[] a,int n,int k){
        for(int i=0;i<n-k+1;i++){
            int j=i;
            for(j=i;j<i+k;j++){
                if(a[j]<0){
                    System.out.println(a[j]);
                    break;
                }
            }
            if(j==i+k)
            System.out.println(0);
        }
    }
    static void firstNegative(int[] a,int n,int k){
        LinkedList<Integer> l=new LinkedList<>();
        for(int i=0;i<k;i++){
            if(a[i]<0)
            l.add(i);
        }
        for(int i=k;i<n;i++){
            if(!l.isEmpty()){
                System.out.print(a[l.peek()]+" ");
                if(l.peek()==i-k)
                    l.remove();
            }else{
                System.out.print(0+" ");
            }
            if(a[i]<0)
            l.add(i);
        }
            if(!l.isEmpty()){
                System.out.print(a[l.peek()]+" ");
            }else{
                System.out.print(0+" ");
            }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        firstNegative(arr,n,k);
    }
}
