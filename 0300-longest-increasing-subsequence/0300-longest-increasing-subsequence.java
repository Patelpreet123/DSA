class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length];
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return x(nums,0,-1,dp);
    }
    int x(int[] nums,int i,int p,int[][] dp){
        if(i==nums.length){
            return 0;
        }
        if(dp[i][p+1]!=-1){
            return dp[i][p+1];
        }
        int t=0;
        if(p==-1||nums[i]>nums[p]){
            t=1+x(nums,i+1,i,dp);
        }
        int nt=x(nums,i+1,p,dp);
        dp[i][p+1]=Math.max(t,nt);
        return dp[i][p+1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna