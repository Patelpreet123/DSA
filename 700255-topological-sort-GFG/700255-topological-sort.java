class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        List<List<Integer>> e=new ArrayList<>();
        for(int i=0;i<V;i++){
            e.add(new ArrayList<>());
        }
        for(int[] x:edges){
            int u=x[0];
            int v=x[1];
            e.get(u).add(v);
        }
        boolean[] vis=new boolean[V];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(e,vis,ans,i);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    void dfs(List<List<Integer>> e,boolean[] vis,ArrayList<Integer> ans,int node){
        vis[node]=true;
        for(int i=0;i<e.get(node).size();i++){
            int neigh=e.get(node).get(i);
            if(!vis[neigh]){
                dfs(e,vis,ans,neigh);
            }
        }
        ans.add(node);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna