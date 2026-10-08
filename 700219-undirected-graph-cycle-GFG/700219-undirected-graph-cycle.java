class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<V;i++){
            l.add(new ArrayList<>());
        }
        for(int[] x:edges){
            int u=x[0];
            int v=x[1];
            l.get(u).add(v);
            l.get(v).add(u);
        }
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfs(l,-1,vis,i)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfs(List<List<Integer>> l,int parent,boolean[] vis,int node){
        vis[node]=true;
        for(int i=0;i<l.get(node).size();i++){
            int neigh=l.get(node).get(i);
            if(neigh!=parent){
                if(vis[neigh]==true){
                    return true;
                }
                if(dfs(l,node,vis,neigh)){
                    return true;
                }
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna