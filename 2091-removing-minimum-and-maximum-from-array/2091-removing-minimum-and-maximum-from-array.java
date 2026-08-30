class Solution {
    public int minimumDeletions(int[] nums) {
        int mn=0,mx=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[mx]){
                mx=i;
            }
            if(nums[i]<nums[mn]){
                mn=i;
            }
        }
        int x1=Math.max(mn,mx)+1;
        int x2=n-Math.min(mn,mx);
        int x3=Math.min(mn,mx)+1+(n-Math.max(mn,mx));
        return Math.min(Math.min(x1,x2),x3);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna