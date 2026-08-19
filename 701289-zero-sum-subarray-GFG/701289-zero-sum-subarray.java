class Solution {
    public boolean subArrayExists(int arr[]) {
        // code here
        int n=arr.length;
        int[] x=new int[n];
        x[0]=arr[0];
        for(int i=1;i<n;i++){
            x[i]=x[i-1]+arr[i];
        }
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            if(s.contains(x[i])||x[i]==0){
                return true;
            }
            s.add(x[i]);
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna