
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int x1=x+arr[i];
            int x2=arr[i]-x;
            if(s.contains(x1)||s.contains(x2)){
                return true;
            }
            s.add(arr[i]);
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna