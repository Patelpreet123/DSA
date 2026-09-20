class Solution {
    public int reverseDegree(String s) {
        int x=0;
        for(int i=0;i<s.length();i++){
            x=x+(i+1)*(26-s.charAt(i)+'a');
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna