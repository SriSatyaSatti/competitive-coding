import java.util.*;
public class MyClass {
    static int largestMatrix(int[][] M,int n,int m){
        int[] h=new int[m];
        int[] l=new int[m];
        int[] r=new int[m];
        for(int i=0;i<m;i++)
        r[i]=m;
        int max=0;
        for(int i=0;i<n;i++){
            int cl=0,cr=m;
            for(int j=0;j<m;j++){
                if(M[i][j]==1)
                h[j]+=1;
                else
                h[j]=0;
            }
            for(int j=0;j<m;j++){
                if(M[i][j]==1){
                    l[j]=Math.max(l[j],cl);
                }
                else{
                    l[j]=0;
                    cl=j+1;
                }
            }
            for(int j=m-1;j>=0;j--){
                if(M[i][j]==1){
                    r[j]=Math.min(r[j],cr);
                }
                else{
                    r[j]=m;
                    cr=j;
                }
            }
            for(int j=0;j<m;j++)
            max=Math.max(max,((r[j]-l[j]))*h[j]);
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int M[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                M[i][j]=sc.nextInt();
            }
        }
        System.out.println(largestMatrix(M,m,n));
    }
}
