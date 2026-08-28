class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> d=new HashSet<>(wordDict);
        List<String> l=new ArrayList<>();
        List<String> c=new ArrayList<>();
        f(s,0,d,c,l);
        return l;
    }
    void f(String s,int i,Set<String> d,List<String> c,List<String> l){
        if(i==s.length()){
            l.add(String.join(" ",c));
            return;
        }
        for(int j=i+1;j<=s.length();j++){
            String x=s.substring(i,j);
            if(d.contains(x)){
                c.add(x);
                f(s,j,d,c,l);
                c.remove(c.size()-1);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna