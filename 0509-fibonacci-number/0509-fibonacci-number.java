class Solution {
    int[] x=new int[31];
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        if(x[n]!=0){
            return x[n];
        }
        return x[n]=fib(n-1)+fib(n-2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna