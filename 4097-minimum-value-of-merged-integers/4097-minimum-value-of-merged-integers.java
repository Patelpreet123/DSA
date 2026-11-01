class Solution {
    public int minMergedInteger(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i+=2){
            String s=String.valueOf(nums[i])+String.valueOf(nums[i+1]);
            int x=Integer.parseInt(s);
            if(x<m){
                m=x;
            }
        }
        return m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna