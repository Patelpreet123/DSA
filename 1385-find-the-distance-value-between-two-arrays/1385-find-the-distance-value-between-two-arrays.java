class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int x=0;
        for(int x1:arr1){
            boolean f=true;
            for(int x2:arr2){
                if(Math.abs(x1-x2)<=d){
                    f=false;
                    break;
                }
            }
            if(f){
                x++;
            }
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna