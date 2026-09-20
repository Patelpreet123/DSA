class Solution {
    int minCost(int[] height) {
        // code here
        int[] dp=new int[height.length];
        Arrays.fill(dp,-1);
        return f(height,height.length-1,dp);
    }
    int f(int[] h,int i,int[] dp){
        if(i==0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int c1=Math.abs(h[i]-h[i-1])+f(h,i-1,dp);
        int c2=Integer.MAX_VALUE;
        if(i>=2){
            c2=Math.abs(h[i]-h[i-2])+f(h,i-2,dp);
        }
        return dp[i]=Math.min(c1,c2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna