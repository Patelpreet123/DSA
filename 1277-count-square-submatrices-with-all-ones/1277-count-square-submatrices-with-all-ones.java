class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int x=0;
        int[][] p=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                p[i][j]=matrix[i-1][j-1]+p[i-1][j]+p[i][j-1]-p[i-1][j-1];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int mn=Math.min(n-i,m-j);
                for(int k=1;k<=mn;k++){
                    int r1=i;
                    int r2=i+k-1;
                    int c1=j;
                    int c2=j+k-1;
                    int s=p[r2+1][c2+1]-p[r1][c2+1]-p[r2+1][c1]+p[r1][c1];
                    if(s==k*k){
                        x++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return x;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna