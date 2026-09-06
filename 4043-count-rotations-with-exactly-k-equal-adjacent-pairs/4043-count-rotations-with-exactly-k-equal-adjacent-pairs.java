class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        String s1=s+s;
        int x=0;
        for(int i=0;i<=n-2;i++){
            if(s1.charAt(i)==s1.charAt(i+1)){
                x++;
            }
        }
        int x1=0;
        if(x==k){
            x1++;
        }
        for(int i=1;i<n;i++){
            if(s1.charAt(i-1)==s1.charAt(i)){
                x--;
            }
            if(s1.charAt(i+n-2)==s1.charAt(i+n-1)){
                x++;
            }
            if(x==k){
                x1++;
            }
        }
        return x1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna