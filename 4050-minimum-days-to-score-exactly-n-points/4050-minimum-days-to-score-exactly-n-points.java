class Solution {
    public int minDays(int n) {
        int[] x=new int[n+1];
        Arrays.fill(x,100001);
        x[0]=-1;
        for(int i=1;i<=n;i++){
            int j=1;
            while(true){
                int s=j*(j+1)/2;
                if(s>i){
                    break;
                }
                x[i]=Math.min(x[i],x[i-s]+j+1);
                j++;
            }
        }
        return x[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna