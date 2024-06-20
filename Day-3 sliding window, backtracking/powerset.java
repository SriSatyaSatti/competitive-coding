import java.util.*;
public class MyClass {
    static void powerSet(String s){
        int n=s.length();
        int k=(int)Math.pow(2,n);
        for(int i=0;i<k;i++){
            String ans="";
            for(int j=0;j<n;j++){
                if((i & 1<<j)>0){
                    ans+=s.charAt(j);
                }
            }
            System.out.println(ans);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        powerSet(s);
    }
}
