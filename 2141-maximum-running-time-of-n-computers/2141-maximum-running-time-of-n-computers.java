class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long l=0;
        long r=0;
        for(int x:batteries){
            r=r+x;
        }
        long ans=-1;
        while(l<=r){
            long m=l+(r-l)/2;
            if(f(batteries,n,m)){
                ans=m;
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return ans;
    }
    boolean f(int[] b,int n,long m){
        long c=0;
        for(int x:b){
            c=c+Math.min(x,m);
        }
        if(c>=n*m){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna