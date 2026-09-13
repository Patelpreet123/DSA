class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] x=new int[n][n];
        for(int i=0;i<n;i++){
            int j=rowShift[i];
            for(int k=0;k<n;k++){
                x[i][(k-j+n)%n]=grid[i][k];
            }
        }
        int[][] ans=new int[n][n];
        for(int i=0;i<n;i++){
            int j=colShift[i];
            for(int k=0;k<n;k++){
                ans[(k-j+n)%n][i]=x[k][i];
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna