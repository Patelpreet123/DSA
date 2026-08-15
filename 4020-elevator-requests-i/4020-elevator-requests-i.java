class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int s=requests[0];
        for(int i=1;i<requests.length;i++){
            s=s+(Math.abs(requests[i]-requests[i-1]));
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna