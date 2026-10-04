class Solution {
    public long maxAlternatingSum(int[] nums) {
        long a=nums[0],b=(long)(-1e14);
        long c=b,d=b;
        long x=a;
        for(int i=1;i<nums.length;i++){
            long x1=nums[i];
            long y1=Math.max(x1,b+x1);
            long y2=a-x1;
            long y3=Math.max(d+x1,a);
            long y4=Math.max(c-x1,b);
            a=y1;
            b=y2;
            c=y3;
            d=y4;
            x=Math.max(x,Math.max(Math.max(a,b),Math.max(c,d)));
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna