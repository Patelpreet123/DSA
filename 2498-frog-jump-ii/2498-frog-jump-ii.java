class Solution {
    public int maxJump(int[] stones) {
        if(stones.length==2){
            return stones[1]-stones[0];
        }
        int m=0;
        for(int i=2;i<stones.length;i++){
            m=Math.max(m,stones[i]-stones[i-2]);
        }
        return m;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna