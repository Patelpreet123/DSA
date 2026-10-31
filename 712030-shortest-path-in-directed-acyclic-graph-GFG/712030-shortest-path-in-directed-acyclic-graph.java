class Solution {
    public ArrayList<Integer> shortestPath(int V, int[][] edges) {
        // Code here
        List<Integer> topo=new ArrayList<>();
        List<List<int[]>> e=new ArrayList<>();
        for(int i=0;i<V;i++){
            e.add(new ArrayList<>());
        }
        for(int[] x:edges){
            e.get(x[0]).add(new int[]{x[1],x[2]});
        }
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(i,e,topo,vis);
            }
        }
        int[] dist=new int[V];
        Arrays.fill(dist,100000000);
        dist[0]=0;
        for(int i=V-1;i>=0;i--){
            int u=topo.get(i);
            int d=dist[u];
            for(int[] neigh:e.get(u)){
                int v=neigh[0];
                int wt=neigh[1];
                if(d+wt<dist[v]){
                    dist[v]=d+wt;
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int x:dist) ans.add(x==100000000?-1:x);
        return ans;
    }
    void dfs(int node,List<List<int[]>> e,List<Integer> topo,boolean[] vis){
        vis[node]=true;
        for(int[] neigh:e.get(node)){
            if(!vis[neigh[0]]){
                dfs(neigh[0],e,topo,vis);
            }
        }
        topo.add(node);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna