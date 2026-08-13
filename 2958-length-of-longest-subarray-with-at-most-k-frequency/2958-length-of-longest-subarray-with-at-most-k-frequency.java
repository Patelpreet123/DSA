class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> m=new HashMap<>();
        int mx=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            while(m.get(nums[i])>k){
                m.put(nums[l],m.get(nums[l])-1);
                l++;
            }
            mx=Math.max(mx,i-l+1);
        }
        return mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna