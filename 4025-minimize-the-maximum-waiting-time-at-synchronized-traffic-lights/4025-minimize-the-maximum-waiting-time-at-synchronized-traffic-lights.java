class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int m=0;
        for(int x:lights){
            if(x>m){
                m=x;
            }
        }
        int m1=0;
        for(int x:arrivalTime){
            int r=x%period;
            if(r>=m){
                if(period-r>m1){
                    m1=period-r;
                }
            }
        }
        return m1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna