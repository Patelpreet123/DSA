class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int[] x=new int[nums.length];
        x[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            x[i]=x[i-1]+nums[i];
        }
        int min=nums.length+1;
        int k=lb(x,target);
        if(k<nums.length){
            min=Math.min(min,k+1);
        }
        for(int i=0;i<nums.length;i++){
            int t=target+x[i];
            int j=lb(x,t);
            if(j<nums.length){
                min=Math.min(min,j-i);
            }
        }
        return min==nums.length+1?0:min;
    }
    int lb(int[] x,int t){
        int l=0,r=x.length-1;
        int ans=x.length;
        while(l<=r){
            int m=l+(r-l)/2;
            if(x[m]>=t){
                ans=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna