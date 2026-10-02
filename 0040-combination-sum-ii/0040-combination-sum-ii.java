class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> s=new HashSet<>();
        f(s,new ArrayList<>(),0,0,target,candidates);
        return new ArrayList<>(s);
    }
    void f(Set<List<Integer>> l,List<Integer> l1,int s,int i,int t,int[] a){
        if(s==t){
            l.add(new ArrayList<>(l1));
            return;
        }
        if(s>t||i==a.length){
            return;
        }
        if(s+a[i]<=t){
            l1.add(a[i]);
            f(l,l1,s+a[i],i+1,t,a);
            l1.remove(l1.size()-1);
        }
        while(i+1<a.length&&a[i]==a[i+1]){
            i++;
        }
        f(l,l1,s,i+1,t,a);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna