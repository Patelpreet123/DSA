class Solution {
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        // code here
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
        for(int i=0;i<V;i++){
            l.add(new ArrayList<>());
        }
        for(ArrayList<Integer> l1:edges){
            int u=l1.get(0);
            int v=l1.get(1);
            l.get(u).add(v);
            l.get(v).add(u);
        }
        boolean[] vis=new boolean[V];
        int ans=0;
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                ans++;
                dfs(i,l,vis);
            }
        }
        return ans;
    }
    void dfs(int node,ArrayList<ArrayList<Integer>> edges,boolean[] vis){
        vis[node]=true;
        for(int i=0;i<edges.get(node).size();i++){
            int neigh=edges.get(node).get(i);
            if(vis[neigh]==false){
                vis[neigh]=true;
                dfs(neigh,edges,vis);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna