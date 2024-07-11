import java.util.*;
public class MyClass {
    static Stack<Integer> au=new Stack<>();
    static Stack<Integer> or=new Stack<>();
    static void push(int x){
        or.push(x);
        int top=au.top();
        au.push(Math.min(x,top));
    }
    static int pop(){
        return or.pop();
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            push(x);
        }
        for(Integer i:or){
            System.out.println(pop());
        }
    }
}
