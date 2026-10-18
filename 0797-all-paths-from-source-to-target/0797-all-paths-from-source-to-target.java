class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        f(graph,0,graph.length-1,new ArrayList<>(),ans);
        return ans;
    }
    void f(int[][] graph,int src,int dest,List<Integer> l,List<List<Integer>> ans){
        l.add(src);
        if(src==dest){
            ans.add(new ArrayList<>(l));
        }
        else{
            for(int neigh:graph[src]){
                f(graph,neigh,dest,l,ans);
            }
        }
        l.remove(l.size()-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna