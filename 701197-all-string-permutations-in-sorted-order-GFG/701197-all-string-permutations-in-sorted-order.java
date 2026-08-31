class Solution {
    public ArrayList<String> permutation(String s) {
        // code here
        ArrayList<String> l=new ArrayList<>();
        f(s,"",l);
        Collections.sort(l);
        return l;
    }
    void f(String s,String a,ArrayList<String> l){
        if(s.length()==0){
            l.add(a);
            return;
        }
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            String s1=s.substring(0,i)+s.substring(i+1);
            f(s1,a+curr,l);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna