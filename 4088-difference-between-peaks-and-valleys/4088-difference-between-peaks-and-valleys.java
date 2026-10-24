class Solution {
    public int peakValleyDifference(int[] nums) {
        int a=0,b=0;
        for(int i=1;i<=nums.length-2;i++){
            if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
                a+=nums[i];
            }
            if(nums[i]<nums[i-1]&&nums[i]<nums[i+1]){
                b+=nums[i];
            }
        }
        return a-b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna