class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        long s=0,w=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            if(i<n/2){
                w+=nums[i];
            }
        }
        int x=0;
        for(int i=0;i<n;i++){
            if(s<2*w){
                x++;
            }
            w=w-nums[i];
            w=w+nums[(i+n/2)%n];
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna