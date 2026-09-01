class Solution {
    public void solveSudoku(int[][] mat) {
        // code here
        solve(mat,0,0);
    }
    boolean solve(int[][] x,int r,int c){
        if(r==9&&c==0){
            return true;
        }
        int nr=r;
        int nc=c+1;
        if(nc==9){
            nr=r+1;
            nc=0;
        }
        if(x[r][c]!=0){
            return solve(x,nr,nc);
        }
        for(int digit=1;digit<=9;digit++){
            if(isValid(x,r,c,digit)){
                x[r][c]=digit;
                if(solve(x,nr,nc)){
                    return true;
                }
                x[r][c]=0;
            }
        }
        return false;
    }
    boolean isValid(int[][] x,int r,int c,int digit){
        for(int i=0;i<9;i++){
            if(x[i][c]==digit){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(x[r][i]==digit){
                return false;
            }
        }
        int rs=(r/3)*3;
        int cs=(c/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(x[rs+i][cs+j]==digit){
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