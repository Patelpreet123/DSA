class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] x=new int[k];
        int s=0;
        int c=0;
        for(int n:nums){
            s=s+n;
            int m=s%k;
            if(m<0){
                m+=k;
            }
            if(m==0){
                c++;        
            }
            c=c+x[m];
            x[m]++;
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna