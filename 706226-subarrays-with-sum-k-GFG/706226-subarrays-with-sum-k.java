class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        return f(arr,k);
    }
    int f(int[] a,int t){
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int x=0;
        int s=0;
        for(int n:a){
            s=s+n;
            if(m.containsKey(s-t)){
                x=x+m.get(s-t);
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