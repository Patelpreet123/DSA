class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        boolean[] vis=new boolean[adj.size()];
        vis[0]=true;
        dfs(adj,vis,l,0);
        return l;
    }
    void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer> l,int node){
        vis[node]=true;
        l.add(node);
        for(int i=0;i<adj.get(node).size();i++){
            int neigh=adj.get(node).get(i);
            if(!vis[neigh]){
                dfs(adj,vis,l,neigh);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna