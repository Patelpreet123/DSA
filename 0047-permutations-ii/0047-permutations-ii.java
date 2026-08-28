class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] v=new boolean[nums.length];
        f(nums,new ArrayList<>(),v,l);
        return l;
    }
    void f(int[] a,List<Integer> l1,boolean[] v,List<List<Integer>> l){
        if(l1.size()==a.length){
            l.add(new ArrayList<>(l1));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(v[i]){
                continue;
            }
            if(i>0&&a[i]==a[i-1]&&!v[i-1]){
                continue;
            }
            v[i]=true;
            l1.add(a[i]);
            f(a,l1,v,l);
            l1.remove(l1.size()-1);
            v[i]=false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna