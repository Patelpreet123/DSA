class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] x=new int[101];
        for(int i=0;i<nums.length;i++){
            if(x[nums[i]]==0){
                x[nums[i]]=1;
            }
            else if(x[nums[i]]==1&&nums[i]!=nums[i-1]){
                x[nums[i]]=2;
            }
        }
        int a=0;
        for(int i=0;i<101;i++){
            if(x[i]==1){
                a++;
            }
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna