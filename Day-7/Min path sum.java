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
// if (n==1) 
//         return k;
//         if (n==2) 
//         return (long)k*k%1000000007;
//         long[] dp=new long[n];
//         dp[0]=k;dp[1]=(long)k*k%1000000007;
//         for(int i=2;i<n;i++){
//             dp[i]=((dp[i-1]+dp[i-2])%1000000007*(k-1)%1000000007)%1000000007;
//         }
//         return dp[n-1]%1000000007;
       return find(a,n,n)
    }
