class Solution {

    public int countTriplets(int[] arr, int l, int r) {
        // code here
        Arrays.sort(arr);
        return x(arr,r)-x(arr,l-1);
    }
    int x(int[] arr,int t){
        int a=0;
        for(int i=0;i<=arr.length-3;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int s=arr[i]+arr[j]+arr[k];
                if(s<=t){
                    a+=(k-j);
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna