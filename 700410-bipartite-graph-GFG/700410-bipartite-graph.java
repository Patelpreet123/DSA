class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        // Code here
        int[] vis=new int[V];
        
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
        
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(bfs(l,vis,i)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean bfs(List<List<Integer>> l,int[] vis,int node){
        vis[node]=1;
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int t=q.remove();
            for(int neigh:l.get(t)){
                if(vis[neigh]==0){
                    if(vis[t]==1){
                        vis[neigh]=2;
                    }
                    else{
                        vis[neigh]=1;
                    }
                    q.add(neigh);
                }
                else if(vis[neigh]==vis[t]){
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