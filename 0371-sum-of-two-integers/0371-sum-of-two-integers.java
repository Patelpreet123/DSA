class Solution {
    public int getSum(int a, int b) {
        if(a<0){
            while(a!=0){
                b=~(-b);
                a=-(~a);
            }
            return b;
        }
        while(a!=0){
            b=-~b;
            a=~-a;
        }
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna