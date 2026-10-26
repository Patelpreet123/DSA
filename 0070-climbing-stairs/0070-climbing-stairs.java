class Solution {
    int[] x;
    public int climbStairs(int n) {
        x=new int[n+1];
        Arrays.fill(x,-1);
        return f(n);
    }
    int f(int n){
        if(n<=3){
            return n;
        }
        if(x[n]!=-1){
            return x[n];
        }
        return x[n]=f(n-1)+f(n-2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna