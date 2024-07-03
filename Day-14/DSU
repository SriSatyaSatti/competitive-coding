import java.util.*;
public class MyClass {
    static void union(int x,int y){
        int rx=find(x);
        int ry=find(y);
        parent[ry]=rx;
    }
    static int find(int i){
        if(parent[i]==i)
        return i;
        parent[i]=find(parent[i]);
        return parent[i];
    }
    static int[] parent;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        parent=new int[n];
        for(int i=0;i<n;i++)
        parent[i]=i;
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            union(x,y);
        }
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(find(a)==find(b))
            System.out.print(true);
            else
            System.out.print(false);
        }
    }
}
