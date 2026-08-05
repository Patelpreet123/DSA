class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String m="";
        for(int i=0;i<n-1;i++){
            int l=i,r=i+1;
            while(l>=0&&r<=n-1){
                if(s.charAt(l)!=s.charAt(r)){
                    break;
                }
                l--;
                r++;
            }
            String s1=s.substring(l+1,r);
            if(s1.length()>m.length()){
                m=s1;
            }
        }
        for(int i=0;i<n;i++){
            int l=i,r=i;
            while(l>=0&&r<=n-1){
                if(s.charAt(l)!=s.charAt(r)){
                    break;
                }
                l--;
                r++;
            }
            String s1=s.substring(l+1,r);
            if(s1.length()>m.length()){
                m=s1;
            }
        }
        return m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna