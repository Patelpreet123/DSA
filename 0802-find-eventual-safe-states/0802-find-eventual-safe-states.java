class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> e=new ArrayList<>();
        for(int i=0;i<n;i++){
            e.add(new ArrayList<>());
        }
        int[] indeg=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                e.get(graph[i][j]).add(i);
            }
            indeg[i]=graph[i].length;
        }
        int[] q=new int[n];
        int f=0,r=0;
        for(int i=0;i<n;i++){
            if(indeg[i]==0){
                q[r]=i;
                r++;
            }
        }
        while(f<r){
            int t=q[f];
            f++;
            for(int neigh:e.get(t)){
                indeg[neigh]--;
                if(indeg[neigh]==0){
                    q[r]=neigh;
                    r++;
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0) ans.add(i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna