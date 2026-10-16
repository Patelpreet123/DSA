class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        f(nums,0,l,new ArrayList<>());
        return l;
    }
    void f(int[] nums,int i,List<List<Integer>> l,List<Integer> c){
        if(i==nums.length){
            l.add(new ArrayList<>(c));
            return;
        }
        c.add(nums[i]);
        f(nums,i+1,l,c);
        c.remove(c.size()-1);
        while(i+1<nums.length&&nums[i]==nums[i+1]){
            i++;
        }
        f(nums,i+1,l,c);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna