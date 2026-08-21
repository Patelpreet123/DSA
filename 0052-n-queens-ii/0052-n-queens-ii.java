class Solution {
    public int totalNQueens(int n) {
        List<List<String>> l=new ArrayList<>();
        x(l,n);
        return l.size();
    }
    void x(List<List<String>> l,int n){
        char[][] a=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]='.';
            }
        }
        solve(a,0,n,l);
    }
    void solve(char[][] a,int i,int n,List<List<String>> l){
        if(i==n){
            List<String> t=new ArrayList<>();
            for (int x=0;x<n;x++){
                t.add(new String(a[x]));
            }
            l.add(t);
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(j,i,a,n)){
                a[j][i]='Q';
                solve(a,i+1,n,l);
                a[j][i]='.';
            }
        }
    }
    boolean isSafe(int r,int c,char[][] a,int n){
        for(int i=0;i<c;i++){
            if(a[r][i]=='Q'){
                return false;
            }
        }
        for(int i=r,j=c;j>=0&&i<n;j--,i++){
            if(a[i][j]=='Q'){
                return false;
            }
        }
        for(int i=r,j=c;j>=0&&i>=0;j--,i--){
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