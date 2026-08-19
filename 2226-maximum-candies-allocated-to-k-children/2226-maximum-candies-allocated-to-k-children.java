class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=0;
        for(int x:candies) {
            r=Math.max(x,r);
        }
        int ans=0;
        while(l<=r) {
            int m=l+(r-l)/2;
            if (f(candies,k,m)){
                ans=m;
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return ans;
    }
    private boolean f(int[] arr,long k,int t){
        long c=0;
        for(int x:arr){
            c+=x/t;
            if(c>=k){
                return true;
            }
        }
        if(c>=k){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna