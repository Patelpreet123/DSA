class Solution {
    public int countSubarray(int[] arr, int l, int r) {
        return x(arr,r)-x(arr,l-1);
    }
    int x(int[] a,int t) {
        int c=0;
        int s=0;
        int l=0;
        for(int r=0;r<a.length;r++){
            s=s+a[r];
            while(s>t&&l<=r){
                s=s-a[l];
                l++;
            }
            c=c+(r-l+1);
        }
        return c;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna