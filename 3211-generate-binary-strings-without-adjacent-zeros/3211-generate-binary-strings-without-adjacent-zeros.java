class Solution {
    public List<String> validStrings(int n) {
        List<String> l=new ArrayList<>();
        x(l,' ',"",n);
        return l;
    }
    void x(List<String> l,char c,String s,int n){
        if(s.length()==n){
            l.add(s);
            return;
        }
        if(c!='0'){
            x(l,'0',s+"0",n);
        }
        x(l,'1',s+'1',n);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna