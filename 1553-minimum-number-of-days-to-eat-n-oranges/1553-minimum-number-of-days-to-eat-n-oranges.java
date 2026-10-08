class Solution {
    public int minDays(int n) {
        HashMap<Integer,Integer> m=new HashMap<>();
        return f(n,m);
    }
    int f(int n,HashMap<Integer,Integer> m){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(m.containsKey(n)){
            return m.get(n);
        }
        int x=1 + Math.min(n%2 + f(n/2,m), n%3 + f(n/3,m));
        m.put(n,x);
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna