class Solution {
    public int minimumXORSum(int[] nums1, int[] nums2) {
        int[] dp=new int[(1<<14)+2];
        Arrays.fill(dp,-1);
        return f(nums1,nums2,0,0,dp);
    }
    int f(int[] nums1,int[] nums2,int i,int m,int[] dp){
        if(i==nums1.length){
            return 0;
        }
        if(dp[m]!=-1){
            return dp[m];
        }
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<nums2.length;j++){
            if((m & (1 << j)) != 0) continue;
            ans = Math.min(ans, (nums1[i] ^ nums2[j]) + f(nums1, nums2, i+1, m | (1 << j),dp));
        }
        return dp[m]=ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna