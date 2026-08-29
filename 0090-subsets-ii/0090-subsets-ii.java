class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        f(nums,0,new ArrayList<>(),l);
        return l;
    }
    void f(int[] a,int i,List<Integer> l1,List<List<Integer>> l){
        if(i==a.length){
            l.add(new ArrayList<>(l1));
            return;
        }
        l1.add(a[i]);
        f(a,i+1,l1,l);
        l1.remove(l1.size()-1);
        while(i+1<a.length&&a[i]==a[i+1]){
            i++;
        }
        f(a,i+1,l1,l);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna