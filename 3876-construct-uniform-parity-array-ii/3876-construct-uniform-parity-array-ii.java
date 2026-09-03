class Solution {
    public boolean uniformArray(int[] nums1) {
        int m=nums1[0];
        int x=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==1){
                x++;
            }
            if(nums1[i]<m){
                m=nums1[i];
            }
        }
        if(x==0){
            return true;
        }
        if(m%2==0){
            return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna