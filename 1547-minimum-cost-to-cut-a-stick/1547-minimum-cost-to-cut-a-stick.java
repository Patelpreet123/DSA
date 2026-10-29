class Solution {
    public int minCost(int n, int[] cuts) {
        int n1=cuts.length;
        int[][] dp=new int[n1+2][n1+2];
        for(int i=0;i<n1+2;i++){
            for(int j=0;j<n1+2;j++){
                dp[i][j]=-1;
            }
        }
        int[] x=new int[n1+2];
        Arrays.sort(cuts);
        x[0]=0;
        for(int i=1;i<=n1;i++){
            x[i]=cuts[i-1];
        }
        x[n1+1]=n;
        return f(x,1,n1,dp);
    }
    int f(int[] cuts,int s,int e,int[][] dp){
        if(s>e){
            return 0;
        }
        if(dp[s][e]!=-1){
            return dp[s][e];
        }
        int min=Integer.MAX_VALUE;
        for(int i=s;i<=e;i++){
            int x=cuts[e+1]-cuts[s-1]+f(cuts,s,i-1,dp)+f(cuts,i+1,e,dp);
            min=Math.min(min,x);
        }
        return dp[s][e]=min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna