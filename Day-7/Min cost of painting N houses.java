int n=A.size();
        int[][]dp=new int[n][3];
        for(int i=0;i<3;i++)
        dp[0][i]=A.get(0).get(i);
        for(int i=1;i<n;i++){
            for(int j=0;j<3;j++){
                int min=Integer.MAX_VALUE;
                if(j==0){
                    min=Math.min(dp[i-1][1],dp[i-1][2]);
                }
                else if(j==1){
                    min=Math.min(dp[i-1][0],dp[i-1][2]);
                }
                else{
                    min=Math.min(dp[i-1][1],dp[i-1][0]);
                }
                dp[i][j]=min+A.get(i).get(j);
            }
        }
        return Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2]));
