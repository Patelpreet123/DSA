class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int m=1;
        int a=1,b=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                a++;
                b=1;
            }
            else if(nums[i]<nums[i-1]){
                b++;
                a=1;
            }
            else{
                a=1;
                b=1;
            }
            m=Math.max(m,Math.max(a,b));
        }
        return m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna