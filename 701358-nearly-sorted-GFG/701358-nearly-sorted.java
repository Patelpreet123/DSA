class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        int x=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(pq.size()>k){
                arr[x]=pq.poll();
                x++;
            }
            pq.add(arr[i]);
        }
        while(!pq.isEmpty()){
            arr[x]=pq.poll();
            x++;
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna