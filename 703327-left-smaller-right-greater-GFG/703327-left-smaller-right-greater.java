class Solution {
    public int findElement(int[] arr) {
        // code here
        int n=arr.length;
        int[] x=new int[n];
        x[0]=arr[0];
        int[] y=new int[n];
        y[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            x[i]=Math.max(x[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            y[i]=Math.min(y[i+1],arr[i]);
        }
        // System.out.println(Arrays.toString(x));
        // System.out.println(Arrays.toString(y));
        for(int i=1;i<=n-2;i++){
            if(arr[i]>=x[i]&&arr[i]<=y[i]){
                return arr[i];
            }
        }
        return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna