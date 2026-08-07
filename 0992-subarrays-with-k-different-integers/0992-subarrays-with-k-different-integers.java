class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return x(nums,k)-x(nums,k-1);
    }
    int x(int[] nums,int k){
        HashMap<Integer,Integer> m=new HashMap<>();
        int l=0,r=0;
        int n=nums.length;
        int c=0;
        while(r<n){
            m.put(nums[r],m.getOrDefault(nums[r],0)+1);
            while(m.size()>k){
                m.put(nums[l],m.get(nums[l])-1);
                if(m.get(nums[l])==0){
                    m.remove(nums[l]);
                }
                l++;
            }
            c=c+(r-l+1);
            r++;
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna