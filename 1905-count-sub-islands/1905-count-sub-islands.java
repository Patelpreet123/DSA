class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int ans=0;
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                if(grid2[i][j]==1){
                    if(dfs(grid2,i,j,grid1)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    boolean dfs(int[][] grid,int r,int c,int[][] grid1){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==0){
            return true;
        }
        grid[r][c]=0;
        boolean x=false;
        if(grid1[r][c]==1){
            x=true;
        }
        boolean q=dfs(grid,r+1,c,grid1);
        boolean w=dfs(grid,r,c+1,grid1);
        boolean e=dfs(grid,r-1,c,grid1);
        boolean t=dfs(grid,r,c-1,grid1);
        return q && w && e && t && x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna