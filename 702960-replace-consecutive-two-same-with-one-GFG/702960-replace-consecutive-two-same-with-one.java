class Solution {
    public String removeDuplicates(String s) {
        // code here
        StringBuilder s1=new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                s1.append(s.charAt(i-1));
            }
        }
        s1.append(s.charAt(s.length()-1));
        return s1.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna