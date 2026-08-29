class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        f(l,nums,0,new ArrayList<>());
        return l;
    }
    void f(List<List<Integer>> l,int[] a,int i,List<Integer> l1){
        if(i==a.length){
            l.add(new ArrayList<>(l1));
            return;
        }
        l1.add(a[i]);
        f(l,a,i+1,l1);
        l1.remove(l1.size()-1);
        f(l,a,i+1,l1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna