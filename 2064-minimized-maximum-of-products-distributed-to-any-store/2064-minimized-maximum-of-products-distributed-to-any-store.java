class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1,h=quantities[0];
        for(int i=1;i<quantities.length;i++){
            h=Math.max(h,quantities[i]);
        }
        int ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(f(n,quantities,m)){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    boolean f(int n,int[] q,int m){
        int c=0 ;
        for(int x:q){
            c+=(x/m) ;
            if(x%m!=0){
                c++ ;
            }
        }
        if(c<=n){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna