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
                Queue<int[]> q=new LinkedList<>();
                q.add(new int[]{i,-1});
                vis[i]=true;
                while(!q.isEmpty()){
                    int[] t=q.remove();
                    int node=t[0];
                    int parent=t[1];
                    for(int neigh:l.get(node)){
                        if(!vis[neigh]){
                            vis[neigh]=true;
                            q.add(new int[]{neigh,node});
                        }
                        else if(neigh!=parent){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna