class Solution {
    public int climbStairs(int n) {
        int a=1,b=1;
        int s=1;
        for(int i=2;i<=n;i++){
            s=a+b;
            a=b;
            b=s;
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna