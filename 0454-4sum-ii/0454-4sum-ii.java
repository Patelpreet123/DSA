class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n=nums1.length;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int s=nums1[i]+nums2[j];
                if(m.containsKey(s)){
                    m.put(s,m.get(s)+1);
                }
                else{
                    m.put(s,1);
                }
            }
        }
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int s=nums3[i]+nums4[j];
                if(m.containsKey(-s)){
                    x=x+m.get(-s);
                }
            }
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna