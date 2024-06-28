class Solution {
    public int minTaps(int n, int[] a) {
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++)
        dp[i]=n+2;
        dp[0]=0;
        for(int i=1;i<=n+1;i++){
            int s=Math.max((i-1)-(a[i-1]),0);
            int e=Math.min((i-1)+a[i-1],n);
            for(int j=s;j<=e;j++){
                dp[j]=Math.min(dp[j],1+dp[s]);
            }
            
        }
        if(dp[n]==n+2)
        return -1;
        else
        return dp[n];
    }
}
