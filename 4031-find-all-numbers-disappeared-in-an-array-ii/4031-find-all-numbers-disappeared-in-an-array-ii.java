class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        int t=lower;
        for(int n:nums){
            if(t>upper){
                break;
            }
            if(n<t){
                continue;
            }
            if(n==t){
                t++;
            }
            else{
                if(n>t){
                    List<Integer> l1=new ArrayList<>();
                    l1.add(t);
                    l1.add(Math.min(upper,n-1));
                    l.add(l1);
                    t=n+1;
                }
            }
        }
        if(t<=upper){
            List<Integer> l1=new ArrayList<>();
            l1.add(t);
            l1.add(upper);
            l.add(l1);
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna