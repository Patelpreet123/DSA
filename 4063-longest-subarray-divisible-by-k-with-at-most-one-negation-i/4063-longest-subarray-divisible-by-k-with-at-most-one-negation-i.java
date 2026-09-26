class Solution {
    public int longestSubarray(int[] nums, int k) {
        int m=0;
        int[] x=new int[k];
        Arrays.fill(x,-1);
        for(int i=0;i<nums.length;i++){
            long s=0;
            for(int j=i;j<nums.length;j++){
                s+=nums[j];
                int r=(int)(s%k);
                if(r<0){
                    r+=k;
                }
                int r1=(int)((2*nums[j])%k);
                if(r1<0){
                    r1+=k;
                }
                x[r1]=i;
                if(r==0||x[r]==i){
                    m=Math.max(m,j-i+1);
                }
            }
        }
        return m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna