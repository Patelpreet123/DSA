class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int x=0;
        for(int i=0;i<intervals.length;i++){
            for(int j=i+1;j<intervals.length;j++){
                int a1=intervals[i][0];
                int a2=intervals[i][1];
                int b1=intervals[j][0];
                int b2=intervals[j][1];
                if(Math.max(a1,b1)<=Math.min(a2,b2)){
                    x++;
                }
            }
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna