class Solution {
    int[] par=new int[26];
    public boolean equationsPossible(String[] equations) {
        for(int i=0;i<26;i++){
            par[i]=i;
        }
        for(String x:equations){
            int i=x.charAt(0)-'a';
            int j=x.charAt(3)-'a';
            int e=x.charAt(1);
            if(e=='='){
                union(i,j);
            }
        }
        for(String x:equations){
            int i=x.charAt(0)-'a';
            int j=x.charAt(3)-'a';
            int e=x.charAt(1);
            if(e=='!'){
                if(find(i)==find(j)){
                    return false;
                }
            }
        }
        return true;
    }
    int find(int i){
        if(par[i]==i){
            return i;
        }
        return par[i]=find(par[i]);
    }
    void union(int i,int j){
        int i1=find(i);
        int j1=find(j);
        if(i1!=j1){
            par[i1]=j1;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna