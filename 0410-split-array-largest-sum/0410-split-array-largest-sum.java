class Solution {
    public int splitArray(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int s=0;
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
            max=Math.max(max,nums[i]);
        }
        int low=max,high=s;
        while(low<=high){
            int m=(low)+(high-low)/2;
            int c=0;
            s=0;
            for(int i=0;i<nums.length;i++){
                s=s+nums[i];
                if(s>m){
                    c++;
                    s=nums[i];
                }
            }
            c++;
            if(c>k){
                low=m+1;
            }
            else{
                high=m-1;
            }
        }
        return low;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna