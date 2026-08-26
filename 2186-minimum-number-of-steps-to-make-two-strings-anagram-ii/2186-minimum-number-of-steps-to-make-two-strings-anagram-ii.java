class Solution {
    public int minSteps(String s, String t) {
        int[] x=new int[26];
        for(int i=0;i<s.length();i++){
            x[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            x[t.charAt(i)-'a']--;
        }
        int sm=0;
        for(int i=0;i<26;i++){
            sm=sm+Math.abs(x[i]);
        }
        return sm;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna