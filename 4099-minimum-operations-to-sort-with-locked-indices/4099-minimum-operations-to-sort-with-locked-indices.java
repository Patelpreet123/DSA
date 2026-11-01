class Solution {
    public int minOperations(int[] nums, int[] locked, int k) {
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    x++;
                }
            }
        }
        int[] x1=new int[n];
        for(int i=0;i<n;i++){
            if(i!=nums[i]-1){
                int s,e;
                if(i<=nums[i]-1){
                    s=i;
                    e=nums[i]-1;
                }
                else{
                    e=i;
                    s=nums[i]-1;
                }
                for(int j=s;j<=e;j++){
                    x1[j]=1;
                }
            }
        }
        int k1=0;
        for(int i=0;i<n;i++){
            if(x1[i]==1&&locked[i]==1){
                k1++;
            }
        }
        if(k1>k){
            return -1;
        }
        return k1+x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna