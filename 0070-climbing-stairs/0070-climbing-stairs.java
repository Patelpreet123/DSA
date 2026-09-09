class Solution {
    public int climbStairs(int n) {
        int[] a=new int[n+1];
        Arrays.fill(a,-1);
        return x(n,a);
    }
    int x(int n,int[] a){
        if(n<=3){
            return n;
        }
        if(a[n]!=-1){
            return a[n];
        }
        a[n]=x(n-1,a)+x(n-2,a);
        return a[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna