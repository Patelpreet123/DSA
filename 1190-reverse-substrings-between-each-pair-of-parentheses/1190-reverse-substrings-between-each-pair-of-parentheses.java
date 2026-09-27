class Solution {
    public String reverseParentheses(String s) {
        StringBuilder s1=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c==')'){
                StringBuilder t=new StringBuilder();
                while(!st.isEmpty()&&st.peek()!='('){
                    t.append(st.pop());
                }
                if(!st.isEmpty()) st.pop();
                for(int i=0;i<t.length();i++){
                    st.push(t.charAt(i));
                }
            }
            else{
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            s1.append(st.pop());
        }
        return s1.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna