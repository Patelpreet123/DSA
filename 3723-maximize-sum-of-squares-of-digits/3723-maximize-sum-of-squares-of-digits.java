class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder s1=new StringBuilder();
        while(num!=0){
            if(num==1&&sum>=10){
                return "";
            }
            if(sum>=9){
                s1.append('9');
                sum-=9;
            }
            else if(sum!=0){
                s1.append(sum);
                sum=0;
            }
            else{
                s1.append('0');
            }
            num--;
        }
        return s1.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna