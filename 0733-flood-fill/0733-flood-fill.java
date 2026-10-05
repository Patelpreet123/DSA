class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    void dfs(int[][] image,int i,int j,int color,int t){
        if(i<0||j<0||i>=image.length||j>=image[0].length){
            return;
        }
        if(image[i][j]!=t){
            return;
        }
        image[i][j]=color;
        dfs(image,i+1,j,color,t);
        dfs(image,i-1,j,color,t);
        dfs(image,i,j+1,color,t);
        dfs(image,i,j-1,color,t);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna