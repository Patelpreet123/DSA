class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int l=0,sl=0;
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                l++;
            }
            else{
                sl+=num.charAt(i)-'0';
            }
        }
        int r=0,sr=0;
        for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                r++;
            }
            else{
                sr+=num.charAt(i)-'0';
            }
        }
        if((l+r)%2!=0){
            return true;
        }
        if(2*(sr-sl)==9*(l-r)){
            return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna