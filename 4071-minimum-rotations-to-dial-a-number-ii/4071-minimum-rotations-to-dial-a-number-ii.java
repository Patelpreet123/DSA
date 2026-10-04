class Solution {
    public int minRotations(int n, String s) {
        char[] x=s.toCharArray();
        int l=x[n-1]-'0';
        int t=f(0,x[0]-'0');
        for(int i=1;i<n;i++){
            t=t+f(x[i-1]-'0',x[i]-'0');
        }
        int m=Math.min(t,t-f(0,x[0]-'0')+f(0,l));
        for(int i=1;i<n;i++){
            int p=x[i-1]-'0';
            int q=x[i]-'0';
            m=Math.min(m,t-f(p,q)+f(p,l));
        }
        return m;
    }
    int f(int x,int y){
        int a=Math.abs(x-y);
        return Math.min(a,10-a);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna