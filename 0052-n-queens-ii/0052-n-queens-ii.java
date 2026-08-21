class Solution {
    int c=0;
    public int totalNQueens(int n) {
        char[][] a=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]='.';
            }
        }
        solve(a,0,n);
        return c;
    }
    void solve(char[][] a,int i,int n){
        if(i==n){
            c++;
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(i,j,a,n)){
                a[i][j]='Q';
                solve(a,i+1,n);
                a[i][j]='.';
            }
        }
    }
    boolean isSafe(int r,int c,char[][] a,int n){
        for(int i=0;i<r;i++){
            if(a[i][c]=='Q'){
                return false;
            }
        }
        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--){
            if(a[i][j]=='Q'){
                return false;
            }
        }
        for(int i=r-1,j=c+1;i>=0&&j<n;i--,j++){
            if(a[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna