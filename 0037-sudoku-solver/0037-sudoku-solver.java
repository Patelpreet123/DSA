class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char k='1';k<='9';k++){
                        if(isValid(board,i,j,k)){
                            board[i][j]=k;
                            if(solve(board)){
                                return true;
                            }
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean isValid(char[][] board,int i,int j,char k){
        int[] a=new int[10];
        int[] b=new int[10];
        int[] c=new int[10];
        for(int p=0;p<9;p++){
            if(board[i][p]!='.'){
                if(board[i][p]==k){
                    return false;
                }
            }
            if(board[p][j]!='.'){
                if(board[p][j]==k){
                    return false;
                }
            }
        }
        int p=(i/3)*3;
        int q=(j/3)*3;
        for(int x=p;x<p+3;x++){
            for(int y=q;y<q+3;y++){
                if(board[x][y]!='.'){
                    if(board[x][y]==k){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna