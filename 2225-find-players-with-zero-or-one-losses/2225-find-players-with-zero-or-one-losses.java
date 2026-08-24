class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            int x=matches[i][1];
            if(m.containsKey(x)){
                m.put(x,m.get(x)+1);
            }
            else{
                m.put(x,1);
            }
        }
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int k:m.keySet()){
            if(m.get(k)==1){
                l2.add(k);
            }
        }
        Set<Integer> l1=new HashSet<>();
        for(int i=0;i<matches.length;i++){
            int x=matches[i][0];
            if(!m.containsKey(x)){
                l1.add(x);
            }
        }
        List<Integer> l11=new ArrayList<>(l1);
        Collections.sort(l11);
        Collections.sort(l2);
        l.add(l11);
        l.add(l2);
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna