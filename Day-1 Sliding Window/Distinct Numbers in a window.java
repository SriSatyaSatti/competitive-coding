import java.util.*;
public class MyClass {
    static ArrayList<Integer> count1(int a[],int n,int k){
        HashSet<Integer> h=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n-k+1;i++){
            h=new HashSet<>();
            for(int j=i;j<i+k;j++){
                h.add(a[j]);
            }
            ans.add(h.size());
        }
        return ans;
    }
    static ArrayList<Integer> count(int a[],int n,int k){
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer, Integer> h=new HashMap<>();
        for(int i=0;i<k;i++){
            h.put(a[i],h.getOrDefault(a[i],0)+1);
        }
        ans.add(h.size());
        for(int i=k;i<n;i++){
            h.put(a[i-k],h.get(a[i-k])-1);
            if(h.get(a[i-k])==0)
            h.remove(a[i-k]);
            h.put(a[i],h.getOrDefault(a[i],0)+1);
            ans.add(h.size());
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
      ArrayList<Integer> ans=new ArrayList<>();
      ans=count1(arr,n,k);
      for(Integer i:ans){
          System.out.print(i+" ");
      }
    }
}
