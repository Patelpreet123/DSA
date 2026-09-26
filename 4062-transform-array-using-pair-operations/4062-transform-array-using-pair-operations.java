class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long s1=0,s2=0;
        for(int i=0;i<source.length;i++){
            s1+=source[i];
            s2+=target[i];
        }
        if(s1==s2){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna