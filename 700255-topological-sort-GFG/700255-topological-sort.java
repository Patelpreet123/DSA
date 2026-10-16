class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        List<List<Integer>> e=new ArrayList<>();
        for(int i=0;i<V;i++){
            e.add(new ArrayList<>());
        }
        int[] indegree=new int[V];
        for(int[] x:edges){
            int u=x[0];
            int v=x[1];
            e.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int t=q.remove();
            ans.add(t);
            for(int i=0;i<e.get(t).size();i++){
                int neigh=e.get(t).get(i);
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    q.add(neigh);
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna