class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        int[][] dp=new int[n][W+1];
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return x(n-1,W,val,wt,dp);
    }
    int x(int i,int cap,int[] val,int[] wt,int[][] dp){
        if(cap<=0){
            return 0;
        }
        if(i==0){
            if(wt[0]<=cap){
                return val[0];
            }
            return 0;
        }
        if(dp[i][cap]!=-1){
            return dp[i][cap];
        }
        int inc=0;
        if(wt[i]<=cap){
            inc=val[i]+x(i-1,cap-wt[i],val,wt,dp);
        }
        int exc=x(i-1,cap,val,wt,dp);
        dp[i][cap]=Math.max(inc,exc);
        return dp[i][cap];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna