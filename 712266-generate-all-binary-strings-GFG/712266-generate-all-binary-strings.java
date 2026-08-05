class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> l=new ArrayList<>();
        x(l,n,"");
        return l;
    }
    void x(ArrayList<String> l,int n,String s){
        if(s.length()==n){
            l.add(s);
            return;
        }
        x(l,n,s+"0");
        x(l,n,s+"1");
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna