import java.util.*;
public class MyClass {
    static int maxProduct(int a[],int n){
        int ans=a[0],cmax=a[0],cmin=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<0){
                int t=cmax;
                cmax=cmin;
                cmin=t;
            }
            cmax=Math.max(a[i],a[i]*cmax);
            cmin=Math.min(a[i],a[i]*cmin);
            ans=Math.max(ans,cmax);
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int M[]=new int[n];
        for(int i=0;i<n;i++){
            M[i]=sc.nextInt();
        }
        System.out.println(maxProduct(M,n));
    }
}
