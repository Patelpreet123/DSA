class Solution {
    public boolean isTree(int n, int m, int[][] edges) {
        // code here
        if(m!=n-1){
            return false;
        }
        int[] x=new int[n];
        for(int i=0;i<n;i++){
            x[i]=i;
        }
        for(int[] e:edges){
            int a=e[0];
            int b=e[1];
            
            int a1=f(a,x);
            int b1=f(b,x);
            if(a1==b1){
                return false;
            }
            x[b1]=a1;
        }
        return true;
    }
    int f(int node,int[] par){
        if(par[node]==node){
            return node;
        }
        par[node]=f(par[node],par);
        return par[node];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna