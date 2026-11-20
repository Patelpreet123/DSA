class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=wt.length;
        int[][] dp=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(W,val,wt,n,dp);
    }
    int f(int w,int[] val,int[] wt,int n,int[][] dp){
        if(n==0||w==0){
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if(wt[n-1]<=w){
            dp[n][w]=Math.max(val[n-1]+f(w-wt[n-1],val,wt,n-1,dp),f(w,val,wt,n-1,dp));
        }
        else{
            dp[n][w]=f(w,val,wt,n-1,dp);
        }
        return dp[n][w];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna