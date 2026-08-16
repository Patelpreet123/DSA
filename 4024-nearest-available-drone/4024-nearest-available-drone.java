class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int m=Integer.MAX_VALUE;
        int x=target[0];
        int y=target[1];
        int a=-1;
        for(int i=0;i<drones.length;i++){
            int x1=drones[i][0];
            int y1=drones[i][1];
            int d=Math.abs(x1-x)+Math.abs(y1-y);
            if(d<=drones[i][2]){
                if(d<m){
                    m=d;
                    a=i;
                }
            }
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna