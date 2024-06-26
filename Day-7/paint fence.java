if (n==1) 
        return k;
        if (n==2) 
        return (long)k*k%1000000007;
        long[] dp=new long[n];
        dp[0]=k;dp[1]=(long)k*k%1000000007;
        for(int i=2;i<n;i++){
            dp[i]=((dp[i-1]+dp[i-2])%1000000007*(k-1)%1000000007)%1000000007;
        }
        return dp[n-1]%1000000007;
