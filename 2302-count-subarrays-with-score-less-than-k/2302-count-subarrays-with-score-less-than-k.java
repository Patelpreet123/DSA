class Solution {
    public long countSubarrays(int[] nums, long k) {
        int i=0,j=0;
        long x=0;
        long sum=0;
        long score=0;
        while(j<nums.length){
            sum=sum+nums[j];
            score=sum*(j-i+1);
            while(score>=k){
                sum=sum-nums[i];
                i++;
                score=sum*(j-i+1);
            }
            x+=(j-i+1);
            j++;
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna