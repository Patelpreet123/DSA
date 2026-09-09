class Solution {
    public int rob(int[] nums) {
        int[] a=new int[nums.length];
        Arrays.fill(a,-1);
        return x(0,nums,a);
    }
    int x(int i,int[] nums,int[] a){
        if(i>=nums.length){
            return 0;
        }
        if(a[i]!=-1){
            return a[i];
        }
        int t=nums[i]+x(i+2,nums,a);
        int nt=x(i+1,nums,a);
        a[i]=Math.max(t,nt);
        return a[i];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna