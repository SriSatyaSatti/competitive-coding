import java.util.*;
public class MyClass {
    static void fun(ArrayList<ArrayList<Integer>> a,int n){
        Collections.sort(a,(x,y)->(x.get(0)==y.get(0)?x.get(1)-y.get(1):y.get(0)-x.get(0)));
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(a.get(i).get(1),a.get(i));
        }
        for(int i=0;i<n;i++){
            System.out.println(ans.get(i).get(0)+" "+ans.get(i).get(1));
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            ArrayList<Integer> k=new ArrayList<>();
            k.add(b1);
            k.add(b2);
            a.add(k);
        }
        fun(a,n);
    }
}
