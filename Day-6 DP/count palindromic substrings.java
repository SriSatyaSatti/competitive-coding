import java.util.*;
public class MyClass {
    static int count(String s){
        int n=s.length();
        int c=0;
        boolean[][] dp=new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        c=n;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
            dp[i-1][i]=true;
            c++;
            }
        }
        for(int i=3;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                int k=i+j-1;
                if(dp[j+1][k-1]==true){
                    if(s.charAt(j)==s.charAt(k)){
                        dp[j][k]=true;
                        c++;
                    }
                }
            }
        }
        return c;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(count(s));
    }
}
