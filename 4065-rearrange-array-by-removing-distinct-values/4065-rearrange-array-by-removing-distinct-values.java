class Solution {
    public int[] rearrangeArray(int[] nums) {
        TreeMap<Integer,Integer> m=new TreeMap<>();
        int mx=0;
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
            mx=Math.max(mx,m.get(n));
        }
        List<List<Integer>> x=new ArrayList<>();
        for(int i=0;i<mx;i++){
            x.add(new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            int n=e.getKey();
            int f=e.getValue();
            for(int i=0;i<f;i++){
                x.get(i).add(n);
            }
        }
        int[] ans=new int[nums.length];
        int i=0;
        for(List<Integer> r:x){
            for(int n:r){
                ans[i]=n;
                i++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna