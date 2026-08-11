class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        x(l,new ArrayList<>(),nums,0);
        return l;
    }
    void x(List<List<Integer>> l,List<Integer> c,int[] nums,int i){
        if(i==nums.length){
            l.add(new ArrayList<>(c));
            return;
        }
        c.add(nums[i]);
        x(l,c,nums,i+1);
        c.remove(c.size()-1);
        while(i+1<nums.length&&nums[i]==nums[i+1]){
            i++;
        }
        x(l,c,nums,i+1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna