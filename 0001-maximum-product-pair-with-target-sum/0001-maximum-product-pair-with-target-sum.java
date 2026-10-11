class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] ans={-1,-1};
        Map<Integer,Integer> mp=new HashMap<>();
        int mx=-10001;
        for(int i=0;i<nums.length;i++){
            int t1=target-nums[i];
            if(mp.containsKey(t1)){
                int x=mp.get(t1);
                if(nums[i]!=nums[x]){
                    if(nums[i]*nums[x]>mx){
                        mx=nums[i]*nums[x];
                        if(nums[i]>nums[x]){
                            ans[0]=i;
                            ans[1]=x;
                        }
                        else{
                            ans[0]=x;
                            ans[1]=i;
                        }
                    }
                }
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna