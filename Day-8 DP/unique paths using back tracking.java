import java.util.*;
public class MyClass {
    static Boolean isValid(int i,int j,int N){
        if(i<0 || j<0 || i>=N || j>=N)
        return false;
        return true;
    }
    static int countPaths(int M[][],int i,int j,int m,int n,boolean[][] visited){
        if(i==m-1 && j==n-1)
        return 1;
        int c=0;
        visited[i][j]=true;
        int N=M.length;
        if(isValid(i,j,N) && M[i][j]==1){
            if(i+1<N && !visited[i+1][j])
            c+=countPaths(M,i+1,j,m,n,visited);
            if(i-1>=0 && !visited[i-1][j])
            c+=countPaths(M,i-1,j,m,n,visited);
            if(j+1<N && !visited[i][j+1])
            c+=countPaths(M,i,j+1,m,n,visited);
            if(j-1>=0 && !visited[i][j-1])
            c+=countPaths(M,i,j-1,m,n,visited);
        }
        visited[i][j]=false;
        return c;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int M[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                M[i][j]=sc.nextInt();
            }
        }
        boolean visited[][]=new boolean[m][n];
        System.out.println(countPaths(M,0,0,m,n,visited));
    }
}
