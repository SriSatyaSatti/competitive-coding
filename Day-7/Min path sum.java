int find(int[][] a,int m,int n){
        if(m==0 && n==0)
        return a[0][0];
        else if(m==0)
        return find(a,m,n-1)+a[m][n];
        else if(n==0)
        return find(a,m-1,n)+a[m][n];
        else
        return Math.max(find(a,m-1,n),find(a,m,n-1))+a[m][n];
    }
    static int maximumPath(int n, int a[][])
    {
        // code here
       return find(a,n,n)
    }
