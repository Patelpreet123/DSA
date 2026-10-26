class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] x=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(x[i]==0){
                if(bfs(i,graph,x)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean bfs(int i,int[][] graph,int[] x){
        x[i]=1;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i,-1});
        while(!q.isEmpty()){
            int[] t=q.remove();
            int node=t[0];
            for(int neigh:graph[node]){
                if(x[neigh]==0){
                    q.add(new int[]{neigh,node});
                    if(x[node]==1){
                        x[neigh]=2;
                    }
                    else{
                        x[neigh]=1;
                    }
                }
                else if(x[neigh]==x[node]){
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