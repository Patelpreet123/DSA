class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int n=intervals.length;
        int[] s=new int[n];
        for(int i=0;i<n;i++){
            s[i]=intervals[i][0];
        }
        Arrays.sort(s);
        long x=0;
        for(int i=0;i<n;i++){
            int l=0,r=n;
            while(l<r){
                int m=l+(r-l)/2;
                if(s[m]>intervals[i][1]){
                    r=m;
                }
                else{
                    l=m+1;
                }
            }
            x=x+(n-l);
        }
        return ((long)n*(n-1)/2)-x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna