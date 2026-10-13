class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=nums[i]*(-1);
            }
        }
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int t=0;
        long s=0;
        while(i<=j){
            if(t==0){
                t=1;
                s+=(nums[j]*nums[j]);
                j--;
            }
            else{
                t=0;
                s-=(nums[i]*nums[i]);
                i++;
            }
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna