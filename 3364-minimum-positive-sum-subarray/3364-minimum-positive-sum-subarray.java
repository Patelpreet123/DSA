class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int m=Integer.MAX_VALUE;
        for(int n=l;n<=r;n++){
            int i=0,j=0;
            int s=0;
            while(j<n){
                s+=nums.get(j);
                j++;
            }
            if(s>0) m=Math.min(m,s);
            while(j<nums.size()){
                s+=nums.get(j);
                s-=nums.get(i);
                i++;
                j++;
                if(s>0) m=Math.min(m,s);
            }
        }
        return m==Integer.MAX_VALUE?-1:m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna