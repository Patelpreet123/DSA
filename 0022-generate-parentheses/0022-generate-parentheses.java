class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        x(l,"",0,0,n);
        return l;
    }
    void x(List<String> l,String s,int a,int b,int m){
        if(s.length()==2*m) {
            l.add(s);
            return;
        }
        if(a<m){
            x(l,s+"(",a+1,b,m);
        }
        if(b<a){
            x(l,s+")",a,b+1,m);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna