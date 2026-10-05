class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean[] vis=new boolean[adj.size()];
        vis[0]=true;
        while(!q.isEmpty()){
            int i=q.remove();
            l.add(i);
            for(int j=0;j<adj.get(i).size();j++){
                int neighbour=adj.get(i).get(j);
                if(!vis[neighbour]){
                    vis[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna