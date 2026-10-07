class Solution {
    int mx=0;
    Set<String> st=new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        f(s,0,"",0);
        return new ArrayList<>(st);
    }
    void f(String s,int i,String c,int x){
        if(x<0||c.length()+s.length()-i<mx){
            return;
        }
        if(i==s.length()){
            if(x==0){
                if(c.length()>mx){
                    mx=c.length();
                    st.clear();
                }
                st.add(c);
            }
            return;
        }
        char x1=s.charAt(i);
        int nx=x;
        if(x1=='('){
            nx=x+1;
        }
        else if(x1==')'){
            nx=x-1;
        }
        f(s,i+1,c+x1,nx);
        if(x1=='('||x1==')'){
            f(s,i+1,c,x);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna