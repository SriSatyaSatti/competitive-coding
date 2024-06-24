import java.util.*;
public class MyClass {
    static boolean isPalindrome(String s){
        int n=s.length();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1))
            return false;
        }
        return true;
    }
    static String maxLength1(String s){
        int max=1,start=0,n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String k=s.substring(i,j+1);
                if(isPalindrome(k)){
                    if(max<k.length()){
                        max=k.length();
                        start=i;
                    }
                }
            }
        }
        return s.substring(start,start+max);
    }
    static String maxLength(String s){
        int n=s.length();
        int n=s.length();
        boolean dp[][]=new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        int max=1,start=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                dp[i-1][i]=true;
                if(max<2){
                start=i-1;
                max=2;
                }
            }
        }
        for(int i=3;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                int k=i+j-1;
                if(dp[j+1][k-1]==true){
                    if(s.charAt(j)==s.charAt(k)){
                        dp[j][k]=true;
                        if(max<i){
                        start=j;
                        max=i;
                        }
                    }
                }
            }
        }
        return s.substring(start,start+max);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(maxLength1(s));
    }
}
