class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        if(s1.length()==0){
            return true;
        }
        int i=0,j=0;
        while(j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
            }
            if(i==s1.length()){
                return true;
            }
            j++;
        }
        return false;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna