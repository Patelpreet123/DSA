class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        Arrays.sort(points,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int x=0;
        for(int i=0;i<n;i++){
            int y0=points[i][1];
            int m=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                int y1=points[j][1];
                if(y0>=y1){
                    if(y1>m){
                        x++;
                        m=y1;
                    }
                }
            }
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna