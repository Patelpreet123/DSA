class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> m=new HashMap<>();
        for(List<String> l:knowledge){
            m.put(l.get(0),l.get(1));
        }
        int x=0;
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                x=1;
                continue;
            }
            else if(s.charAt(i)==')'){
                x=0;
                if(m.containsKey(s2.toString())){
                    s1.append(m.get(s2.toString()));
                }
                else{
                    s1.append('?');
                }
                s2=new StringBuilder();
                continue;
            }
            if(x==0){
                s1.append(s.charAt(i));
            }
            else{
                s2.append(s.charAt(i));
            }
        }
        return s1.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna