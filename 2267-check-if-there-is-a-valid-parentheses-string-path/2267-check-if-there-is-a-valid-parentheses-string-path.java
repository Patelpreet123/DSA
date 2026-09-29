class Solution {
    public boolean hasValidPath(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][][] dp=new boolean[101][101][202];
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                for(int k=0;k<201;k++){
                    dp[i][j][k]=false;
                }
            }
        }
        if(grid[0][0]=='('){
            dp[0][0][1]=true;
        }
        else{
            return false;
        }
        int c=1;
        for(int i=1;i<n;i++){
            if(grid[i][0]=='('){
                c++;
            }
            else{
                c--;
            }
            if(c>=0){
                dp[i][0][c]=true;
            }
            else{
                break;
            }
        }
        c=1;
        for(int i=1;i<m;i++){
            if(grid[0][i]=='('){
                c++;
            }
            else{
                c--;
            }
            if(c>=0){
                dp[0][i][c]=true;
            }
            else{
                break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                int sub=0;
                if(grid[i][j]=='('){
                    sub=1;
                }else{
                    sub=-1;
                }
                for(int s=0;s<201;s++){
                    if(s==0 && sub==1){
                        continue;
                    }
                    else{
                        dp[i][j][s]=dp[i-1][j][s-sub]||dp[i][j-1][s-sub];
                    }
                }
            }
        }
        return dp[n-1][m-1][0];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna