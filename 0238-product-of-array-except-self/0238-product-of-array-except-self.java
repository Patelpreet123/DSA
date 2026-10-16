class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] x=new int[nums.length];
        int p=1;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            if(nums[i]!=0){
                p=p*nums[i];
            }
        }
        if(z>1){
            return x;
        }
        else if(z==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    x[i]=p;
                }
                else{
                    x[i]=0;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                x[i]=p/nums[i];
            }
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna