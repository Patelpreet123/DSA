class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        boolean[] x=new boolean[adj.size()];
        f(adj,x,0,l);
        return l;
    }
    void f(ArrayList<ArrayList<Integer>> adj,boolean[] x,int s,ArrayList<Integer> l){
        x[s]=true;
        l.add(s);
        for(int i:adj.get(s)){
            if(!x[i]){
                f(adj,x,i,l);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna