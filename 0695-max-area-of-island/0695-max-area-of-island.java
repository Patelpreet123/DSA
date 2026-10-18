class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    ans=Math.max(ans,dfs(grid,i,j));
                }
            }
        }
        return ans;
    }
    int dfs(int[][] grid,int r,int c){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==0){
            return 0;
        }
        grid[r][c]=0;
        return 1+dfs(grid,r+1,c)+dfs(grid,r,c+1)+dfs(grid,r-1,c)+dfs(grid,r,c-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna