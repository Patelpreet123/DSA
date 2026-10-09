class Solution {
    public int minInsertions(String s) {
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(y%2!=0){
                    y--;
                    x++;
                }
                y=y+2;
            }
            else{
                y--;
                if(y<0){
                    y=y+2;
                    x++;
                }
            }
        }
        return x+y;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna