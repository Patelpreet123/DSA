class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        if(n<19){
            return true;
        }
        if(n<27){
            return false;
        }
        if(n<34){
            return true;
        }
        if(n<40){
            return false;
        }
        if(n<45){
            return true;
        }
        if(n<49){
            return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna