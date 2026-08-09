class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double s=0;
        int i=prices.length-1;
        int j=discounts.length-1;
        while(i>=0){
            if(j>=0){
                s=s+prices[i]*(100-discounts[j])/100.0;
                j--;
            }
            else{
                s=s+prices[i];
            }
            i--;
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna