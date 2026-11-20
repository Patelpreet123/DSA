class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int[] dp=new int[nums[nums.length-1]+2];
        int ans=1;
        for(int x:nums){
            dp[x+1]=dp[x]+1;
            dp[x]=dp[x-1]+1;
            ans=Math.max(ans,Math.max(dp[x],dp[x+1]));
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna