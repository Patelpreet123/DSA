class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        for(int i=1;i<n+1;i=-~i){
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(int j=1;j<=n;j=-~j){
            if(j-1>=0&&dp[j-1]!=Integer.MAX_VALUE){
                dp[j]=Math.min(dp[j],dp[j-1]+costs[j-1]+1);
            }
            if(j-2>=0&&dp[j-2]!=Integer.MAX_VALUE){
                dp[j]=Math.min(dp[j],dp[j-2]+costs[j-1]+4);
            }
            if(j-3>=0&&dp[j-3]!=Integer.MAX_VALUE){
                dp[j]=Math.min(dp[j],dp[j-3]+costs[j-1]+9);
            }
        }
        return dp[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna