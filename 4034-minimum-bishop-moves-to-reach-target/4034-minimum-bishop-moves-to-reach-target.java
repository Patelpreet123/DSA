class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sx=source[0];
        int sy=source[1];
        int dx=target[0];
        int dy=target[1];
        if(sx==dx&&sy==dy){
            return 0;
        }
        if(Math.abs(sx-dx)==Math.abs(sy-dy)){
            return 1;
        }
        if((sx+sy)%2!=(dx+dy)%2){
            return -1;
        }
        return 2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna