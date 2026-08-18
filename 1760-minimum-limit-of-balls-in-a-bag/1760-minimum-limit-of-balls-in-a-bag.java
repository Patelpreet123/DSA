class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=nums[0];
        for(int x:nums){
            r=Math.max(r,x);
        }
        int ans=r;
        while(l<=r){
            int m=l+(r-l)/2;
            if(f(nums,maxOperations,m)){
                ans=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    private boolean f(int[] a,int mx,int m){
        int x=0;
        for(int v:a){
            x+=(v-1)/m;
            if(x>mx){
                return false;
            }
        }
        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna