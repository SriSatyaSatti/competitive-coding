import java.util.*;
public class MyClass {
    static int longestSubArray(int a[],int n){
        int c=1,k=0,max=0;
        for(int i=1;i<n;i++){
            if(a[i]*a[i-1]<0){
                c++;
            }else{
                c=1;
            }
            if(max<c){
                max=c;
                k=i;
            }
        }
        for(int i=k-max+1;i<=k;i++){
            System.out.println(a[i]);
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int M[]=new int[n];
        for(int i=0;i<n;i++){
            M[i]=sc.nextInt();
        }
        System.out.println(longestSubArray(M,n));
    }
}
