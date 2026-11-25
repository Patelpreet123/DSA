class Solution {
    public int averageValue(int[] nums) {
        int s=0,x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
                x++;
                s+=nums[i];
            }
        }
        return x==0?0:s/x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna