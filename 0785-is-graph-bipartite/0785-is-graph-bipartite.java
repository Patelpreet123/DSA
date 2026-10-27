class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] x=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(x[i]==0){
                if(dfs(i,-1,graph,x)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean dfs(int node,int par,int[][] graph,int[] x){
        if(x[node]!=0){
            if(par!=-1&&x[par]==x[node]){
                return true;
            }
            return false;
        }
        if(par==-1||x[par]==2){
            x[node]=1;
        }
        else{
            x[node]=2;
        }
        for(int neigh:graph[node]){
            if(dfs(neigh,node,graph,x)){
                return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna