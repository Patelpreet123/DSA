class Solution {
    public int minDeletions(int[] nums) {
        int x=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                x++;
            }
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna