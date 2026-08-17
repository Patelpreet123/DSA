class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long min=time[0];
        for(int x:time){
            min=Math.min(min,x);
        }
        long s=1,e=min*totalTrips;
        long ans=-1;
        while(s<=e){
            long m=s+(e-s)/2;
            long c=0;
            for(int x:time){
                c=c+m/x;
            }
            if(c>=totalTrips){
                e=m-1;
                ans=m;
            }
            else{
                s=m+1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna