import java.util.*;
public class MyClass {
    static int min;
    static Stack<Integer> s=new Stack<>();
    static void push(int x){
        if(s.isEmpty()){
            s.push(x);
            min=x;
        }else{
            if(x>=min)
            s.push(x);
            else{
                s.push(2*x-min);
                min=x;
            }
        }
    }
    static int pop(){
        if(s.isEmpty())
        return -1;
        int x=min;
        int top=s.pop();
        if(x>top){
            min=2*min-top;
            return x;
        }
        return top;
    }
    static int getMin(){
        if(s.isEmpty())
        return -1;
        int x=min;
        int top=s.pop();
        if(x>top){
            min=2*min-top;
        }
        return x;
    }
    static int top(){
        if(s.isEmpty())
        return -1;
        int x=min;
        int top=s.peek();
        if(x>top){
            min=2*min-top;
            return x;
        }
        return top;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            push(x);
        }
        for(int i=0;i<n;i++){
            System.out.println(getMin());
        }
    }
}
