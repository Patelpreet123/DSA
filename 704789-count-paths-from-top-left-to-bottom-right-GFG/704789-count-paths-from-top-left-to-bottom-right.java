class Solution {
    public int numberOfPaths(int m, int n) {
        // code here
        int[][] a=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=-1;
            }
        }
        return f(m,n,0,0,a);
    }
    int f(int m,int n,int i,int j,int[][] a){
        if(i==m-1&&j==n-1){
            return 1;
        }
        if(i<0||j<0||i>=m||j>=n){
            return 0;
        }
        if(a[i][j]!=-1){
            return a[i][j];
        }
        int d=f(m,n,i+1,j,a);
        int l=f(m,n,i,j+1,a);
        a[i][j]=d+l;
        return a[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna