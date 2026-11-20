class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int n=cost.length;
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++) Arrays.fill(dp[i],-1);
        return f(cost,time,0,cost.length,dp);
    }
    int f(int[] cost,int[] time,int i,int w,int[][] dp){
        if(w<=0){
            return 0;
        }
        if(i==cost.length){
            return 1000000000;
        }
        if(dp[i][w]!=-1){
            return dp[i][w];
        }
        return dp[i][w]=Math.min(f(cost,time,i+1,w,dp),cost[i]+f(cost,time,i+1,w-time[i]-1,dp));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna