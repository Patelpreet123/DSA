class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> m=new HashMap<>();
        int s=0;
        int max=0;
        m.put(0,-1);
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
            if(m.containsKey(s-k)){
                max=Math.max(max,i-m.get(s-k));
            }
            if(!m.containsKey(s)){
                m.put(s,i);
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna