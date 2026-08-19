class Solution {
    int maxLength(int arr[]) {
        // code here
        int n=arr.length;
        int[] x=new int[n];
        x[0]=arr[0];
        for(int i=1;i<n;i++){
            x[i]=x[i-1]+arr[i];
        }
        HashMap<Integer,Integer> m=new HashMap<>();
        int max=0;
        for(int i=0;i<n;i++){
            if(x[i]==0){
                max=Math.max(max,i+1);
            }
            if(m.containsKey(x[i])){
                max=Math.max(max,i-m.get(x[i]));
            }
            if(m.containsKey(x[i])){
                continue;
            }
            m.put(x[i],i);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna