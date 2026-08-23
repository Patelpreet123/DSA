class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder s1=new StringBuilder(s.length()*8);
        for(char c:s.toCharArray()){
            for(int i=7;i>=0;i--){
                s1.append(1&(c>>i));
            }
        }
        int l=0;
        int r=s1.length()-1;
        while(l<r){
            if(s1.charAt(l)!=s1.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna