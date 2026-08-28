class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        f(nums,0,l);
        return l;
    }
    void f(int[] a,int s,List<List<Integer>> l){
        if(s==a.length){
            List<Integer> l1=new ArrayList<>();
            for(int x:a){
                l1.add(x);
            }
            l.add(l1);
            return;
        }
        for(int i=s;i<a.length;i++){
            int t=a[s];
            a[s]=a[i];
            a[i]=t;
            f(a,s+1,l);
            t=a[s];
            a[s]=a[i];
            a[i]=t;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna