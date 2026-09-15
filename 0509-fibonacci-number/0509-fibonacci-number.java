class Solution {
    public int fib(int n) {
        int[] x=new int[n+1];
        Arrays.fill(x,-1);
        return f(n,x);
    }
    int f(int n,int[] x){
        if(n==0||n==1){
            return n;
        }
        if(x[n]!=-1){
            return x[n];
        }
        x[n]=f(n-1,x)+f(n-2,x);
        return x[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna