class Solution {
    long mod=1000000007;
    public int sumDecoded(long[] nums) {
        long s=0;
        for(long x1:nums){
            int w=(int)(x1%10);
            long d=x1/10;
            String s1=String.valueOf(d);
            long x=Long.parseLong(s1.substring(0,w));
            long y=Long.parseLong(s1.substring(w));
            long a=1;
            while(y>0){
                if(y%2==1){
                    a=(a*x)%mod;
                }
                x=(x*x)%mod;
                y=y/2;
            }
            s=(s+a)%mod;
        }
        return (int)s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna