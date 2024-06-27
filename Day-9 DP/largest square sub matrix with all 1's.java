import java.util.*;
public class MyClass {
    static int largestMatrix(int[][] M,int m,int n){
        int max=0;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=M[i][0];
            if(M[i][0]==1)
            max=1;
        }
        for(int i=0;i<n;i++){
            dp[0][i]=M[0][i];
            if(M[0][i]==1)
            max=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(M[i][j]==1){
                    int x=Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]))+1;
                    dp[i][j]=x;
                    max=Math.max(max,x);
                }else{
                    dp[i][j]=0;
                }
            }
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
