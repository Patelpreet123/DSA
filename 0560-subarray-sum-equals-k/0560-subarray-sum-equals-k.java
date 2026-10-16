class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int s=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(mp.containsKey(s-k)){
                ans+=mp.get(s-k);
            }
            if(mp.containsKey(s)){
                mp.put(s,mp.get(s)+1);
            }
            else{
                mp.put(s,1);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna