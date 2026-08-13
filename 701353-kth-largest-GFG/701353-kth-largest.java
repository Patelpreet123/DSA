class Solution {
    public static int kthLargest(int arr[], int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:arr){
            pq.add(x);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna