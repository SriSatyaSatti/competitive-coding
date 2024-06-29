import java.util.*;
public class MyClass {
    static void findAllPalindromes(String x,boolean[][] p){
        int n=x.length();
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                if(i==j)
                p[i][j]=true;
                else if(x.charAt(i)==x.charAt(j)){
                    if(i+1==j)
                    p[i][j]=true;
                    else
                    p[i][j]=p[i+1][j-1];
                }else{
                    p[i][j]=false;
                }
            }
        }
    }
    static int minCuts(String x,boolean[][] p){
        int n=x.length();
        int dp[]=new int[n];
        for(int i=n-1;i>=0;i--){
            dp[i]=Integer.MAX_VALUE;
            if(p[i][n-1]==true)
            dp[i]=0;
            else{
                for(int j=n-2;j>=i;j--){
                    if(p[i][j]==true)
                    dp[i]=Math.min(dp[i],1+dp[j+1]);
                }
            }
        }
        return dp[0];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        boolean p[][]=new boolean[n][n];
        findAllPalindromes(s,p);
        System.out.println(minCuts(s,p));
    }
}
