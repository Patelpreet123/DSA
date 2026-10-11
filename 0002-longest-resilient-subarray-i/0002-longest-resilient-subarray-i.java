class Solution {
    public int resilientSubarray(int[] nums, int k) {
        int ans=1;
        int n=nums.length;
        int i=0;
        while(i<n){
            int r=nums[i]%k;
            int j=i;
            while(j<n&&nums[j]%k==r){
                j++;
            }
            for(int k1=j-i;k1>0;k1--){
                if(((k1-1)*r)%k==0){
                    ans=Math.max(ans,k1);
                    break;
                }
            }
            i=j;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna