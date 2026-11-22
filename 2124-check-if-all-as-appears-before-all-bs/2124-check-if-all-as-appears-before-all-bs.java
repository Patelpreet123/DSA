class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        int x=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'){
                x=i;
                break;
            }
        }
        if(x==-1){
            return true;
        }
        for(int i=x;i<n;i++){
            if(s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna