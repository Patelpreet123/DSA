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
                if(bfs(l,vis,i)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean bfs(List<List<Integer>> l,boolean[] vis,int node){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{node,-1});
        vis[node]=true;
        while(!q.isEmpty()){
            int[] x=q.remove();
            int x1=x[0];
            int par=x[1];
            for(int i=0;i<l.get(x1).size();i++){
                int neigh=l.get(x1).get(i);
                if(!vis[neigh]){
                    vis[neigh]=true;
                    q.add(new int[]{neigh,x1});
                }
                else{
                    if(neigh!=par){
                        return true;
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