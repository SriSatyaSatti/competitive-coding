import java.util.*;
public class MyClass {
    static int count1(int[] a,int n){
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(Math.abs(a[i]));
        }
        return h.size();
    }
    static int count(int[] a,int n){
        int l=0,r=n-1,count=n;
        while(l<r){
            while(l<n-1 && a[l]==a[l+1]){
                l++;
                count--;
            }
            while(l<r && a[r]==a[r-1] && r>1){
                r--;
                count--;
            }
            if(l<r){
                int sum=a[l]+a[r];
                if(sum==0){
                    l++;
                    r--;
                    count--;
                }else{
                    if(sum<0)
                    l++;
                    else
                    r--;
                }
            }
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(count(arr,n));
    }
}
