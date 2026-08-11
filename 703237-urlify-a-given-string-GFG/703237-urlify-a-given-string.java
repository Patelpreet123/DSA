class Solution {
    static String URLify(String s) {
        // code here
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                s1.append("%20");
            }
            else{
                s1.append(s.charAt(i));
            }
        }
        return s1.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna