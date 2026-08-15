class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int m=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int x=i;
            for(int j=0;j<n/2;j++){
                int l=(i+j)%n;
                int r=(i+n-j-1)%n;
                int d=Math.abs(s.charAt(l)-s.charAt(r));
                x=x+(Math.min(26-d,d));
            }
            m=Math.min(m,x);
        }
        return m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna