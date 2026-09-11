class Solution {
    public int totalNumbers(int[] digits) {
        int[] x=new int[10];
        for(int i=0;i<digits.length;i++){
            x[digits[i]]++;
        }
        int ans=0;
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<9;k+=2){
                    x[i]--;
                    x[j]--;
                    x[k]--;
                    if(x[i]>=0&&x[j]>=0&&x[k]>=0){
                        ans++;
                    }
                    x[i]++;
                    x[j]++;
                    x[k]++;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna