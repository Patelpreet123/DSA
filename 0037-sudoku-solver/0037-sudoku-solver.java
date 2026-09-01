class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    boolean solve(char[][] x,int r,int c){
        if(r==9&&c==0){
            return true;
        }
        int nr=r;
        int nc=c+1;
        if(nc==9){
            nr=r+1;
            nc=0;
        }
        if(x[r][c]!='.'){
            return solve(x,nr,nc);
        }
        for(int d=1;d<=9;d++){
            if(isValid(x,r,c,(char)(d+'0'))){
                x[r][c]=(char)(d+'0');
                if(solve(x,nr,nc)){
                    return true;
                }
                x[r][c]='.';
            }
        }
        return false;
    }
    boolean isValid(char[][] x,int r,int c,char d){
        for(int i=0;i<9;i++){
            if(x[i][c]==d){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(x[r][i]==d){
                return false;
            }
        }
        int sr=(r/3)*3;
        int sc=(c/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(x[sr+i][sc+j]==d){
                    return false;
                }
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna