class Solution {
    public int minOperations(int[] nums, int x) {
        int x1=0;
        for(int v:nums){
            x1+=v;
        }
        int t=x1-x;
        int i=0,j=0;
        int s=0;
        int m=-1;
        while(j<nums.length){
            s=s+nums[j];
            while(i<nums.length&&s>t){
                s=s-nums[i];
                i++;
            }
            if(s==t){
                m=Math.max(m,j-i+1);
            }
            j++;
        }
        if(m==-1){
            return -1;
        }
        return nums.length-m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna