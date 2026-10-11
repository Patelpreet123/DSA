class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n%2!=0){
            return false;
        }
        int a=0,b=1;
        while(b<n/2){
            int s=a+b;
            a=b;
            b=s;
        }
        if(b==n/2){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna