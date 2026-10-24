class Solution {
    int[] par;
    public ArrayList<Integer> DSU(int n, int[][] queries) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        par=new int[n+1];
        for(int i=0;i<=n;i++){
            par[i]=i;
        }
        for(int[] x:queries){
            if(x[0]==2){
                ans.add(find(x[1]));
            }
            else{
                union(x[1],x[2]);
            }
        }
        return ans;
    }
    int find(int i){
        if(i==par[i]){
            return i;
        }
        return par[i]=find(par[i]);
    }
    void union(int i,int j){
        int i1=find(i);
        int j1=find(j);
        par[i1]=j1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna