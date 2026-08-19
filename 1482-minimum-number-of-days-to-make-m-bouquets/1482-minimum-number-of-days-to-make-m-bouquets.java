class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l=bloomDay[0];
        int r=bloomDay[0];
        for(int i=1;i<bloomDay.length;i++){
            l=Math.min(l,bloomDay[i]);
            r=Math.max(r,bloomDay[i]);
        }
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(f(bloomDay,m,k,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    boolean f(int[] b,int m,int k,int mid){
        int c=0,t=0;
        for(int x:b){
            if(x<=mid){
                t++;
                if(t==k){
                    t=0;
                    c++;
                }
            }
            else{
                t=0;
            }
        }
        return c>=m ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna