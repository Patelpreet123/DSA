class Solution {
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=1;i<=n-2;i++){
            for(int j=1;j<=m-2;j++){
                if(grid[i][j]==0){
                    if(dfs(i,j,grid)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    boolean dfs(int i,int j,int[][] grid){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length){
            return false;
        }
        if(grid[i][j]==1){
            return true;
        }
        grid[i][j]=1;
        boolean a=dfs(i+1,j,grid);
        boolean b=dfs(i-1,j,grid);
        boolean c=dfs(i,j+1,grid);
        boolean d=dfs(i,j-1,grid);
        return a&&b&&c&&d;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna