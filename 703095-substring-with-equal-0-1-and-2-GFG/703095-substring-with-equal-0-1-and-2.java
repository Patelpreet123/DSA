class Solution {
    public int equal012(String s) {
        // code here
        HashMap<String,Integer> m=new HashMap<>();
        m.put("0 0",1);
        int sum=0;
        int ans=0;
        int x0=0,x1=0,x2=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='0'){
                x0++;
            }
            else if(c=='1'){
                x1++;
            }
            else{
                x2++;
            }
            int d1=x0-x1;
            int d2=x1-x2;
            String x=d1+" "+d2;
            if(m.containsKey(x)){
                ans+=m.get(x);
            }
            if(m.containsKey(x)){
                m.put(x,m.get(x)+1);
            }
            else{
                m.put(x,1);
            }
        }
        return ans;
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                 

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna