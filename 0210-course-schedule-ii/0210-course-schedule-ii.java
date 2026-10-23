class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans=new int[numCourses];
        int c=numCourses;
        List<List<Integer>> e=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            e.add(new ArrayList<>());
        }
        int[] indeg=new int[numCourses];
        for(int[] x:prerequisites){
            int u=x[0];
            int v=x[1];
            e.get(u).add(v);
            indeg[v]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int t=q.remove();
            c--;
            ans[c]=t;
            for(int neigh:e.get(t)){
                indeg[neigh]--;
                if(indeg[neigh]==0){
                    q.add(neigh);
                }
            }
        }
        if(c==0) return ans;
        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna