class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans=new String[m];
        for(int i=0;i<m;i=-~i){
            if(i==0){
                StringBuilder s=new StringBuilder();
                for(int j=0;j<n;j=-~j){
                    s.append('.');
                }
                ans[0]=s.toString();
            }
            else{
                StringBuilder s=new StringBuilder();
                for(int j=0;j<n-1;j=-~j){
                    s.append('#');
                }
                s.append('.');
                ans[i]=s.toString();
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna