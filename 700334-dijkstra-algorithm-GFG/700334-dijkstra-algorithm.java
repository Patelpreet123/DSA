class Solution {
    public ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
        // code here
        List<List<int[]>> e=new ArrayList<>();
        for(int i=0;i<V;i++){
            e.add(new ArrayList<>());
        }
        for(int[] x:edges){
            e.get(x[0]).add(new int[]{x[1],x[2]});
            e.get(x[1]).add(new int[]{x[0],x[2]});
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(i==src){
                ans.add(0);
            }
            else{
                ans.add(Integer.MAX_VALUE);
            }
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,src});
        while(!pq.isEmpty()){
            int[] t=pq.remove();
            int d=t[0];
            int u=t[1];
            if(d>ans.get(u)){
                continue;
            }
            for(int[] x:e.get(u)){
                int neigh=x[0];
                int wt=x[1];
                if(ans.get(neigh)>d+wt){
                    ans.set(neigh,d+wt);
                    pq.add(new int[]{d+wt,neigh});
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna