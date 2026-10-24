class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] ans=new int[2];
        int n=edges.length;
        List<List<Integer>> e=new ArrayList<>();
        for(int i=0;i<=n;i++){
            e.add(new ArrayList<>());
        }
        for(int[] x:edges){
            int u=x[0];
            int v=x[1];
            boolean[] vis=new boolean[n+1];
            if(dfs(u,v,e,vis)){
                return x;
            }
            e.get(u).add(v);
            e.get(v).add(u);
        }
        return new int[]{};
    }
    boolean dfs(int curr,int t,List<List<Integer>> e,boolean[] vis){
        if(curr==t){
            return true;
        }
        vis[curr]=true;
        for(int neigh:e.get(curr)){
            if(!vis[neigh]){
                if(dfs(neigh,t,e,vis)){
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