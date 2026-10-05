class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='L'&&!vis[i][j]){
                    ans++;
                    dfs(grid,vis,i,j,n,m);
                }
            }
        }
        return ans;
    }
    void dfs(char[][] grid,boolean[][] vis,int i,int j,int n,int m){
        if(i<0||j<0||i>=n||j>=m){
            return;
        }
        if(grid[i][j]=='W'||vis[i][j]){
            return;
        }
        vis[i][j]=true;
        dfs(grid,vis,i,j+1,n,m);
        dfs(grid,vis,i,j-1,n,m);
        dfs(grid,vis,i+1,j,n,m);
        dfs(grid,vis,i-1,j,n,m);
        dfs(grid,vis,i+1,j+1,n,m);
        dfs(grid,vis,i-1,j-1,n,m);
        dfs(grid,vis,i+1,j-1,n,m);
        dfs(grid,vis,i-1,j+1,n,m);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna