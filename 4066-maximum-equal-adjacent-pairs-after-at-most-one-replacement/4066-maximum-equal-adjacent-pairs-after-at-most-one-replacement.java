class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        int a=0,b=0;
        HashMap<Long,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            int x=nums[i];
            int y=nums[i+1];
            if(x==y){
                a++;
            }
            else{
                long mn=Math.min(x,y);
                long mx=Math.max(x,y);
                long k=(mn<<32)|mx;
                int c=m.getOrDefault(k,0)+1;
                m.put(k,c);
                if(c>b){
                    b=c;
                }
            }
        }
        return a+b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna