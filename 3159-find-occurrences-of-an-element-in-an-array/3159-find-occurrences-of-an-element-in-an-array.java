class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                l.add(i);
            }
        }
        int[] a=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if(queries[i]-1>=l.size()){
                a[i]=-1;
            }
            else{
                a[i]=l.get(queries[i]-1);
            }
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna