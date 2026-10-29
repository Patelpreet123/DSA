class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i=-~i){
            for(int j=0;j<board[0].length;j=-~j){
                if(board[i][j]=='O'){
                    if(f(i,j,board)){
                        fill(i,j,board);
                    }
                }
            }
        }
        for(int i=0;i<board.length;i=-~i){
            for(int j=0;j<board[0].length;j=-~j){
                if(board[i][j]=='.'){
                    board[i][j]='O';
                }
            }
        }
    }
    boolean f(int i,int j,char[][] board){
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]=='X'||board[i][j]=='.'){
            return true;
        }
        boolean boun=i==0||j==0||i==board.length-1||j==board[0].length-1;
        board[i][j]='.';
        boolean a=f(i+1,j,board);
        boolean b=f(i-1,j,board);
        boolean c=f(i,j+1,board);
        boolean d=f(i,j-1,board);
        return !boun&&a&&b&&c&&d;
    }
    void fill(int i,int j,char[][] board){
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!='.'){
            return;
        }
        board[i][j]='X';
        fill(i+1,j,board);
        fill(i-1,j,board);
        fill(i,j+1,board);
        fill(i,j-1,board);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna