class Solution {
    int c=0;
    public int totalNQueens(int n) {
        char[][] x=new char[n][n];
        solve(x,0);
        return c;
    }
    void solve(char[][] x,int i){
        if(i==x.length){
            c++;
            return;
        }
        for(int j=0;j<x.length;j++){
            if(isValid(x,i,j)){
                x[i][j]='Q';
                solve(x,i+1);
                x[i][j]=' ';
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
        while(p>=0&&q<x.length){
            if(x[p][q]=='Q'){
                return false;
            }
            p--;
            q++;
        }
        p=i;
        while(p>=0){
            if(x[p][j]=='Q'){
                return false;
            }
            p--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna