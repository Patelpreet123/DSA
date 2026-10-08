class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color=new int[graph.length];
        boolean[] vis=new boolean[graph.length];
        Queue<Integer> q=new LinkedList<>();
        for(int j=0;j<graph.length;j++){
            if(!vis[j]){
                q.add(j);
                color[j]=1;
                vis[j]=true;
                while(!q.isEmpty()){
                    int x=q.remove();
                    int c=color[x];
                    for(int i=0;i<graph[x].length;i++){
                        int neigh=graph[x][i];
                        if(c==color[neigh]){
                            return false;
                        }
                        if(!vis[neigh]){
                            if(c==1){
                                color[neigh]=2;
                            }
                            else{
                                color[neigh]=1;
                            }
                            vis[neigh]=true;
                            q.add(neigh);
                        }
                    }
                }
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna