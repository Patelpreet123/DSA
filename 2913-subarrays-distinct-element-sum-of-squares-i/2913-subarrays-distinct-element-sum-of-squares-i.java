class Solution {
    public int sumCounts(List<Integer> nums) {
        int x=0;
        for(int i=0;i<nums.size();i++){
            Set<Integer> s=new HashSet<>();
            for(int j=i;j<nums.size();j++){
                s.add(nums.get(j));
                x+=(s.size()*s.size());
            }
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna