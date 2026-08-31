class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        char[][]x=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                x[i][j]='.';
            }
        }
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
        solve(x,0,l);
        return l;
    }
    void solve(char[][] x,int i,ArrayList<ArrayList<Integer>> l){
        if(i==x.length){
            ArrayList<Integer> l1=new ArrayList<>();
            for(int i1=0;i1<x.length;i1++){
                for(int j=0;j<x.length;j++){
                    if(x[i1][j]=='Q'){
                        l1.add(j+1);
                        break;
                    }
                }
            }
            l.add(l1);
            return;
        }
        for(int j=0;j<x.length;j++){
            if(isValid(x,i,j)){
                x[i][j]='Q';
                solve(x,i+1,l);
                x[i][j]='.';
            }
        }
    }
    boolean isValid(char[][] x,int i,int j){
        int si=i,sj=j;
        while(si>=0&&sj>=0){
            if(x[si][sj]=='Q'){
                return false;
            }
            si--;
            sj--;
        }
        si=i;
        sj=j;
        while(si>=0&&sj<x.length){
            if(x[si][sj]=='Q'){
                return false;
            }
            si--;
            sj++;
        }
        si=i;
        while(si>=0){
            if(x[si][j]=='Q'){
                return false;
            }
            si--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna