class Solution {
    int maxLength(int arr[]) {
        // code here
        int n=arr.length;
        int[] a=new int[n];
        a[0]=arr[0];
        for(int i=1;i<n;i++){
            a[i]=a[i-1]+arr[i];
        }
        HashMap<Integer,Integer> m=new HashMap<>();
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                max=Math.max(max,i+1); 
            }
            if(m.containsKey(a[i])){
                max=Math.max(max,i-m.get(a[i]));
                continue;
            }
            m.put(a[i],i);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna