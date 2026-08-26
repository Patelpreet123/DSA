class Solution {
    public int subarraySum(int[] nums, int k) {
        int x=0;
        int s=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        for(int n:nums){
            s+=n;
            if(m.containsKey(s-k)){
                x+=m.get(s-k);
            }
            if(m.containsKey(s)){
                m.put(s,m.get(s)+1);
            }
            else{
                m.put(s,1);
            }
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna