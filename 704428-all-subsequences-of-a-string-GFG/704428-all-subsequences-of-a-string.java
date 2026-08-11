class Solution {
    public List<String> powerSet(String s) {
        // Code here
        List<String> l=new ArrayList<>();
        x(l,s,0,"");
        Collections.sort(l);
        return l;
    }
    void x(List<String> l,String s,int i,String c){
        if(i==s.length()){
            l.add(c);
            return;
        }
        x(l,s,i+1,c+s.charAt(i));
        x(l,s,i+1,c);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna