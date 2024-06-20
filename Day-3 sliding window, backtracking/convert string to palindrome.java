import java.util.*;
public class MyClass {
    static int findMin1(char[] s,int n){
        int dp[][]=new int[n][n];
        for(int i=1;i<n;i++){
            int l,h;
            for(l=0,h=i;h<n;l++,h++){
                if(s[l]==s[h])
                dp[l][h]=dp[l+1][h-1];
                else
                dp[l][h]=Math.min(dp[l][h-1],dp[l+1][h])+1;
            }
        }
        return dp[0][n-1];
    }
    static int findMin2(char[] s,int l,int r){
        if(l>r) return Integer.MAX_VALUE;
        if(l==r) return 0;
        if(r-l==1){
            if(s[l]==s[r])
            return 0;
            else
            return 1;
        }
        if(s[l]==s[r])
        return findMin2(s,l+1,r-1);
        else
        return Math.min(findMin2(s,l+1,r),findMin2(s,l,r-1))+1;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char[] c=s.toCharArray();
        System.out.println(findMin1(c,n));
        System.out.println(findMin2(c,0,n-1));
    }
}
