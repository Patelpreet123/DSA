class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int x=Math.max(Math.min(xCenter,x2),x1);
        int y=Math.max(Math.min(yCenter,y2),y1);
        int p=x-xCenter;
        int q=y-yCenter;
        if((p*p+q*q)<=radius*radius){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna