import java.util.*;
public class MyClass {
    static int maxGenerated(int n){
        int a[]=new int[n+1];
        a[0]=0;
        a[1]=1;
        int max=1;
        for(int i=2;i<=n;i++){
            if(i%2==0)
            a[i]=a[i/2];
            else
            a[i]=a[i/2]+a[i/2+1];
            max=Math.max(max,a[i]);
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(maxGenerated(n));
    }
}
