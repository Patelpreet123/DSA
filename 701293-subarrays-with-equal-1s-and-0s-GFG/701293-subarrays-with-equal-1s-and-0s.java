class Solution {
    public int countSubarray(int[] arr) {
        // code here
        int i=0;
        int x=0;
        int n=arr.length;
        int[] a=new int[n*2+1];
        int s=0;
        a[s+n]++;
        while(i<n){
            if(arr[i]==0){
                s=s-1;
            }
            else{
                s=s+1;
            }
            x=x+a[s+n];
            a[s+n]++;
            i++;
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna