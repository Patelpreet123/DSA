class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int r=0,c=0;
        while(true){
            char d=grid[r][c];
            grid[r][c]='.';
            int r1=r;
            int c1=c;
            if(d=='L'){
                c1--;
            }
            else if(d=='R'){
                c1++;
            }
            else if(d=='U'){
                r1--;
            }
            else if(d=='D'){
                r1++;
            }
            else{
                break;
            }
            if(r1<0||r1>=n||c1<0||c1>=m||grid[r1][c1]=='.'){
                break;
            }
            r=r1;
            c=c1;
        }
        return new int[]{r,c};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna