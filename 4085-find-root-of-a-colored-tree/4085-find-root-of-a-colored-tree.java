class Solution {
    public int findColoredRoot(int[][] edges, String colors) {
        int n=colors.length();
        List<List<Integer>> e=new ArrayList<>();
        for(int i=0;i<n;i++){
            e.add(new ArrayList<>());
        }
        for(int[] x:edges){
            e.get(x[0]).add(x[1]);
            e.get(x[1]).add(x[0]);
        }
        String[] x1={"RBW","BWR","WRB"};
        for(int i=0;i<n;i++){
            if(e.get(i).size()<=2){
                char c=colors.charAt(i);
                int x=-1;
                if(c=='R'){
                    x=0;
                }
                else if(c=='B'){
                    x=1;
                }
                else{
                    x=2;
                }
                if(dfs(i,-1,0,x,e,colors,x1)){
                    return i;
                }
            }
        }
        return -1;
    }
    boolean dfs(int node,int par,int d,int x,List<List<Integer>> e,String colors,String[] x1){
        char x2=x1[x].charAt(d%3);
        if(colors.charAt(node)!=x2){
            return false;
        }
        int child=0;
        for(int neigh:e.get(node)){
            if(neigh!=par){
                child++;
                if(child>2){
                    return false;
                }
                if(!dfs(neigh,node,d+1,x,e,colors,x1)){
                    return false;
                }
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna