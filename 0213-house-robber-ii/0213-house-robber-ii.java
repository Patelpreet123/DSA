class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] a=new int[nums.length];
        Arrays.fill(a,-1);
        int x1=x(0,nums.length-2,nums,a);
        Arrays.fill(a,-1);
        int x2=x(1,nums.length-1,nums,a);
        return Math.max(x1,x2);
    }
    int x(int i,int e,int[] nums,int[] a){
        if(i>e){
            return 0;
        }
        if(a[i]!=-1){
            return a[i];
        }
        int t=nums[i]+x(i+2,e,nums,a);
        int nt=x(i+1,e,nums,a);
        a[i]=Math.max(t,nt);
        return a[i];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna