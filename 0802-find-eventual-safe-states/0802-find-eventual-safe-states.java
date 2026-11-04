class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans=new ArrayList<>();
        int[] state=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(dfs(i,graph,state)){
                ans.add(i);
            }
        }
        return ans;
    }
    boolean dfs(int node,int[][] graph,int[] state){
        if(state[node]==2) return true;
        if(state[node]==3) return false;
        if(state[node]==1) return false;
        state[node]=1;
        for(int neigh:graph[node]){
            if(!dfs(neigh,graph,state)){
                state[neigh]=3;
                return false;
            }
        }
        state[node]=2;
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna