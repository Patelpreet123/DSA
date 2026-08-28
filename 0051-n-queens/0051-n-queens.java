class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> l=new ArrayList<>();
        char[][] x=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                x[i][j]='.';
            }
        }
        solve(l,x,0);
        return l;
    }
    void solve(List<List<String>> l,char[][] x,int j){
        if(j==x.length){
            List<String> l1=new ArrayList<>();
            for(char[] x1:x){
                l1.add(new String(x1));
            }
            l.add(l1);
            return;
        }
        for(int i=0;i<x.length;i++){
            if(isValid(x,i,j)){
                x[i][j]='Q';
                solve(l,x,j+1);
                x[i][j]='.';
            }
        }
    }
    boolean isValid(char[][] x,int i,int j){
        int p=i,q=j;
        while(p>=0&&q>=0){
            if(x[p][q]=='Q'){
                return false;
            }
            p--;
            q--;
        }
        p=i;q=j;
        while(q>=0&&p<x.length){
            if(x[p][q]=='Q'){
                return false;
            }
            p++;
            q--;
        }
        q=j;
        while(q>=0){
            if(x[i][q]=='Q'){
                return false;
            }
            q--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna