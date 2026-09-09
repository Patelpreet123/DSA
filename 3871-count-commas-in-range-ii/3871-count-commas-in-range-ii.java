class Solution {
    public long countCommas(long n) {
        long x=0;
        if(n<1000){
            return 0;
        }
        long s=1000;
        int z=1;
        while(s<=n){
            long y=s*1000-1;
            long c;
            if(y>n){
                c=n-s+1;
            }
            else{
                c=y-s+1;
            }
            x=x+(c*z);
            s=s*1000;
            z++;
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna