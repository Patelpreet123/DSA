class Solution {
    public int scoreOfParentheses(String s) {
        int d=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                d++;
            }
            else{
                d--;
                if(s.charAt(i-1)=='('){
                    ans+=(1<<d);
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna