class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int[][] s=new int[n][2];
        for(int i=0;i<n;i++){
            s[i][0]=intervals[i][0];
            s[i][1]=i;
        }
        Arrays.sort(s,(a,b)->{return a[0]-b[0];});
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int t=intervals[i][1];
            int l=0;
            int r=n-1;
            int x=-1;
            while(l<=r){
                int m=(l+r)/2;
                if(s[m][0]>=t){
                    x=s[m][1];
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
            ans[i]=x;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna