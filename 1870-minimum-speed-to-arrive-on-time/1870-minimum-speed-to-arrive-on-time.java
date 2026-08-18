class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n=dist.length;
        if(hour<=n-1){
            return -1;
        }
        int l=1;
        int r=10000000;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if (f(dist,hour,m)){
                ans=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    
    private boolean f(int[] dist,double h,int m){
        int n=dist.length;
        double t=0;
        for(int i=0;i<n-1;i++){
            t+=Math.ceil((double)dist[i]/m);
        }
        t+=(double)dist[n-1]/m;
        if(t<=h){
            return true;
        }
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna