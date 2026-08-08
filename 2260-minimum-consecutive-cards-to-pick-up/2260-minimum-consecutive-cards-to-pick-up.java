class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int mn=cards.length+1;
        for(int i=0;i<cards.length;i++){
            if(m.containsKey(cards[i])){
                mn=Math.min(mn,i-m.get(cards[i])+1);
            }
            m.put(cards[i],i);
        }
        if(mn==cards.length+1){
            return -1;
        }
        return mn;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna