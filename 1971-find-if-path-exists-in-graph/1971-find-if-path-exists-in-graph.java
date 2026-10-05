class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis=new boolean[n];
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int[] x:edges){
            int u=x[0];
            int v=x[1];
            l.get(u).add(v);
            l.get(v).add(u);
        }
        return f(l,source,destination,vis);
    }
    boolean f(ArrayList<ArrayList<Integer>> l,int s,int d,boolean[] vis){
        if(s==d){
            return true;
        }
        vis[s]=true;
        for(int i=0;i<l.get(s).size();i++){
            int neigh=l.get(s).get(i);
            if(!vis[neigh]&&f(l,neigh,d,vis)){
                return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna