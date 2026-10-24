class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans=0;
        int a=0;
        for(int x:nums){
            if(x>=minK&&x<=maxK){
                a++;
                ans+=a;
            }
            else{
                a=0;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna