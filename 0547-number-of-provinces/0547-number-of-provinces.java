class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] vis=new boolean[isConnected.length];
        int ans=0;
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                ans++;
                dfs(i,vis,isConnected);
            }
        }
        return ans;
    }
    void dfs(int node,boolean[] vis,int[][] isConnected){
        vis[node]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i]==1){
                if(!vis[i]){
                    vis[i]=true;
                    dfs(i,vis,isConnected);
                }
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna