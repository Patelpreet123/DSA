class Solution {
    public int countMagicalPairs(String s) {
        int ans=0;
        int n=s.length();
        for(int j=0;j<=n-2;j++){    
            int[] x=new int[26];
            int[] l=new int[27];
            int u=0;
            for(int i=j;i>=0;i--){
                int c=s.charAt(i)-'a';
                if(x[c]==0){
                    u++;
                }
                x[c]++;
                l[u]++;
            }
            u=0;
            int[] r=new int[26];
            for(int k=j+1;k<n;k++){
                int c=s.charAt(k)-'a';
                if(r[c]==0){
                    u++;
                }
                r[c]++;
                ans+=l[u];
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna