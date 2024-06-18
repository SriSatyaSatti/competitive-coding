import java.util.*;
public class MyClass {
    static ArrayList<Integer> distinct1(int a[],int n,int k){
        HashSet<Integer> h=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n-k+1;i++){
            h=new HashSet<>();
            int sum=0;
            for(int j=i;j<i+k;j++){
                h.add(a[j]);
                sum+=a[j];
            }
            if(h.size()==k)
            ans.add(sum);
        }
        return ans;
    }
    static ArrayList<Integer> distinct2(int a[],int n,int k){
        HashMap<Integer, Integer> h=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int sum=0;
        for(int i=0;i<k;i++){
            h.put(a[i],h.getOrDefault(a[i],0)+1);
            sum+=a[i];
        }
        if(h.size()==k)
            ans.add(sum);
        for(int i=k;i<n;i++){
            sum=sum-a[i-k]+a[i];
            h.put(a[i-k],h.get(a[i-k])-1);
            if(h.get(a[i-k])==0)
            h.remove(a[i-k]);
            h.put(a[i],h.getOrDefault(a[i],0)+1);
            if(h.size()==k)
            ans.add(sum);
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
      ans=distinct1(arr,n,k);
      for(Integer i:ans){
          System.out.print(i+" ");
      }
    }
}
