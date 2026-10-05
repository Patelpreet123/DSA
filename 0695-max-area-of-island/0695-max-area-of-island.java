class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int mx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1&&!vis[i][j]){
                    mx=Math.max(mx,dfs(grid,vis,i,j,n,m));
                }
            }
        }
        return mx;
    }
    int dfs(int[][] grid,boolean[][] vis,int i,int j,int n,int m){
        if(i<0||j<0||i>=n||j>=m){
            return 0;
        }
        if(grid[i][j]==0||vis[i][j]){
            return 0;
        }
        vis[i][j]=true;
        return 1+dfs(grid,vis,i+1,j,n,m)+dfs(grid,vis,i-1,j,n,m)+dfs(grid,vis,i,j+1,n,m)+dfs(grid,vis,i,j-1,n,m);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna