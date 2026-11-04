class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> e=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            e.add(new ArrayList<>());
        }
        int[] indeg=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                e.get(graph[i][j]).add(i);
            }
            indeg[i]=graph[i].length;
        }
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<graph.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int t=q.remove();
            for(int neigh:e.get(t)){
                indeg[neigh]--;
                if(indeg[neigh]==0){
                    q.add(neigh);
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