class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> l=new ArrayList<>();
        char[][] x=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                x[i][j]='.';
            }
        }
        boolean[] c=new boolean[n];
        boolean[] d1=new boolean[2*n-1];
        boolean[] d2=new boolean[2*n-1];
        solve(l,x,0,c,d1,d2);
        return l;
    }
    void solve(List<List<String>> l,char[][] x,int j,boolean[] c,boolean[] d1,boolean[] d2){
        if(j==x.length){
            List<String> l1=new ArrayList<>();
            for(char[] x1:x){
                l1.add(new String(x1));
            }
            l.add(l1);
            return;
        }
        for(int i=0;i<x.length;i++){
            int x1=i-j+x.length-1;
            int x2=i+j;
            if(!c[i]&&!d1[x1]&&!d2[x2]){
                x[i][j]='Q';
                c[i]=true;
                d1[x1]=true;
                d2[x2]=true;
                solve(l,x,j+1,c,d1,d2);
                x[i][j]='.';
                c[i]=false;
                d1[x1]=false;
                d2[x2]=false;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna