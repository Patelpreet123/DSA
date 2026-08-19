class Solution {
    public int minSubarray(int[] nums, int p) {
        int n=nums.length;
        int t=0;
        for(int x:nums){
            t=(t+x)%p;
        }
        if(t==0){
            return 0;
        }
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,-1); 
        int s=0;
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            s=(s+nums[i])%p;
            int x=(s-t+p)%p;
            if(m.containsKey(x)){
                mn=Math.min(mn,i-m.get(x));
            }
            m.put(s,i);
        }
        if(mn==n){
            return -1;
        }
        return mn;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna