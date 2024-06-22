import java.util.*;
public class MyClass {
    static boolean isSubsequence(String s1,String s2,int m,int n){
        if(m==0)
        return true;
        if(n==0)
        return false;
        if(s1.charAt(m)==s2.charAt(n))
        return isSubsequence(s1,s2,m-1,n-1);
        else
        return isSubsequence(s1,s2,m,n-1);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int m=s1.length();
        int n=s2.length();
        System.out.println(isSubsequence(s1,s2,m-1,n-1));
    }
}
