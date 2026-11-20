class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        return f(W,val,wt,wt.length);
    }
    int f(int w,int[] val,int[] wt,int n){
        if(n==0||w==0){
            return 0;
        }
        if(wt[n-1]<=w){
            return Math.max(val[n-1]+f(w-wt[n-1],val,wt,n-1),f(w,val,wt,n-1));
        }
        return f(w,val,wt,n-1);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna