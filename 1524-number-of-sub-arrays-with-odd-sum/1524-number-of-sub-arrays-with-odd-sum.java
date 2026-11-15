class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int s=0;
        int e=1,o=0;
        long ans=0;
        for(int x:arr){
            s+=x;
            if(s%2==1){
                ans+=e;
                o++;
            }
            else{
                ans+=o;
                e++;
            }
        }
        return (int)(ans%1000000007);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna