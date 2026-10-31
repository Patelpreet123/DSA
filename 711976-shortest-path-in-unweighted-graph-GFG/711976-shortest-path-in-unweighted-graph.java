class Solution {
    public int shortestPath(int V, int[][] edges, int src, int dest) {
        // code here
        int[] dist=new int[V];
        Arrays.fill(dist,-1);
        dist[src]=0;
        List<List<Integer>> e=new ArrayList<>();
        for(int i=0;i<V;i++){
            e.add(new ArrayList<>());
        }
        for(int[] x:edges){
            e.get(x[0]).add(x[1]);
            e.get(x[1]).add(x[0]);
        }
        boolean[] vis=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        vis[src]=true;
        while(!q.isEmpty()){
            int t=q.remove();
            for(int neigh:e.get(t)){
                if(!vis[neigh]){
                    dist[neigh]=1+dist[t];
                    vis[neigh]=true;
                    q.add(neigh);
                }
            }
        }
        return dist[dest];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna