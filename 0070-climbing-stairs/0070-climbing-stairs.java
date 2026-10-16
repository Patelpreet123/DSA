class Solution {
    int[] x=new int[46];
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        if(x[n]!=0){
            return x[n];
        }
        return x[n]=climbStairs(n-1)+climbStairs(n-2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna