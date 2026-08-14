class Solution {
    public int maximumLengthSubstring(String s) {
        int m=0;
        int[] x=new int[26];
        int l=0;
        for(int r=0;r<s.length();r++){
            char r1=s.charAt(r);
            x[r1-'a']++;
            while(x[r1-'a']>2){
                x[s.charAt(l)-'a']--;
                l++;
            }
            m=Math.max(m,r-l+1);
        }
        return m;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna