class Solution {
    public int minRotations(String s) {
        int r=0,c=0;
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'0';
            int d=Math.abs(x-c);
            r+=Math.min(d,10-d);
            c=x;
        }
        return r;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna