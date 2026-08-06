class Solution {
    public int numOfWays(int n) {
        long x=6;
        long y=6;
        for(int i=2;i<=n;i++){
            long x1=(3*x+2*y)%1000000007;
            long y1=(2*x+2*y)%1000000007;
            x=x1;
            y=y1;
        }
        return (int)((x+y)%1000000007);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna