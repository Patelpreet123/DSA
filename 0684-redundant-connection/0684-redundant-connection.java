class Solution {
    int[] par;
    public int[] findRedundantConnection(int[][] edges) {
        par=new int[edges.length+1];
        int[] ans=new int[2];
        for(int i=0;i<=edges.length;i++){
            par[i]=i;
        }
        for(int[] x:edges){
            int u=find(x[0]);
            int v=find(x[1]);
            if(u==v){
                ans[0]=x[0];
                ans[1]=x[1];
                return ans;
            }
            par[u]=v;
        }
        return null;
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