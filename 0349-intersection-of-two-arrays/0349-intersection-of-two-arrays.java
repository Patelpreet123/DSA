class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        for(int x:nums1){
            s.add(x);
        }
        List<Integer> l=new ArrayList<>();
        Set<Integer> s1=new HashSet<>();
        for(int x:nums2){
            if(s1.contains(x)){
                continue;
            }
            if(s.contains(x)){
                l.add(x);
            }
            s1.add(x);
        }
        int[] a=new int[l.size()];
        for(int i=0;i<l.size();i++){
            a[i]=l.get(i);
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna