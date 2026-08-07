class Solution {
    public int exactlyK(int arr[], int k) {
        // code here
        return x(arr,k)-x(arr,k-1);
    }
    int x(int[] arr,int k){
        HashMap<Integer,Integer> m=new HashMap<>();
        int l=0,r=0;
        int c=0;
        int n=arr.length;
        while(r<n){
            m.put(arr[r],m.getOrDefault(arr[r],0)+1);
            while(m.size()>k){
                m.put(arr[l],m.get(arr[l])-1);
                if(m.get(arr[l])==0){
                    m.remove(arr[l]);
                }
                l++;
            }
            c=c+r-l+1;
            r++;
        }
        return c;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna