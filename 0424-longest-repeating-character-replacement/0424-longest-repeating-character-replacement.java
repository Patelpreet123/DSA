class Solution {
    public int characterReplacement(String s, int k) {
        int[] x=new int[26];
        int mx=0;
        int l=0,r=0;
        int n=s.length();
        int a=0;
        while(r<n){
            x[s.charAt(r)-'A']++;
            mx=Math.max(mx,x[s.charAt(r)-'A']);
            if(r-l+1-mx>k){
                x[s.charAt(l)-'A']--;
                l++;
                mx=0;
                for(int i=0;i<26;i++){
                    mx=Math.max(mx,x[i]);
                }
            }
            a=Math.max(a,r-l+1);
            r++;
        }
        // System.out.println(mx);
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna