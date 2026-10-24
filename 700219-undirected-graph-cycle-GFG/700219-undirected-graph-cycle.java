class Solution {
    int[] par;
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        par=new int[V];
        for(int i=0;i<V;i++){
            par[i]=i;
        }
        for(int[] x:edges){
            int u=find(x[0]);
            int v=find(x[1]);
            if(u==v){
                return true;
            }
            par[u]=v;
        }
        return false;
    }
    int find(int i){
        if(par[i]==i){
            return i;
        }
        return par[i]=find(par[i]);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna