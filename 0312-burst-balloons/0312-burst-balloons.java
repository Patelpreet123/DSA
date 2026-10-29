class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n+2][n+2];
        for(int i=0;i<n+2;i++){
            for(int j=0;j<n+2;j++){
                dp[i][j]=-1;
            }
        }
        int[] x=new int[n+2];
        x[0]=1;
        x[n+1]=1;
        for(int i=0;i<n;i++){
            x[i+1]=nums[i];
        }
        return f(x,1,n,dp);
    }
    int f(int[] nums,int s,int e,int[][] dp){
        if(s>e){
            return 0;
        }
        if(dp[s][e]!=-1){
            return dp[s][e];
        }
        int max=Integer.MIN_VALUE;
        for(int i=s;i<=e;i++){
            int x=nums[i]*nums[s-1]*nums[e+1]+f(nums,s,i-1,dp)+f(nums,i+1,e,dp);
            max=Math.max(max,x);
        }
        return dp[s][e]=max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna