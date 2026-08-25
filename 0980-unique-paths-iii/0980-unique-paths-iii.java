class Solution {
    int x=0;
    int e=0;
    public int uniquePathsIII(int[][] grid){
        int p=0,q=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    p=i;
                    q=j;
                }
                else if(grid[i][j]==0){
                    e++;
                }
            }
        }
        dfs(grid,p,q,-1);
        return x;
    }
    void dfs(int[][] grid,int r,int c,int ct){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]==-1){
            return;
        }
        if(grid[r][c]==2){
            if(ct==e){
                x++;
            }
            return;
        }
        int t=grid[r][c];
        grid[r][c] = -1;
        dfs(grid,r+1,c,ct+1);
        dfs(grid,r-1,c,ct+1);
        dfs(grid,r,c+1,ct+1);
        dfs(grid,r,c-1,ct+1);
        grid[r][c]=t;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna