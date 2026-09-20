class Solution {
    public long maxValue(int[] nums) {
        long x=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                x+=nums[i];
            }
            else{
                x-=nums[i];
            }
        }
        long s=0;
        long m0=0,m1=(long)1e14;
        long mx=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                s-=nums[i];
            }
            else{
                s+=nums[i];
            }
            if(i%2==0){
                mx=Math.max(mx,s-m1);
                m1=Math.min(m1,s);
            }
            else{
                mx=Math.max(mx,s-m0);
                m0=Math.min(m0,s);
            }
        }
        return x+mx*2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna