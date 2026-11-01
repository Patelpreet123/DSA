class Solution {
    class Node{
        String word;
        int steps;
        Node(String a,int b){
            word=a;
            steps=b;
        }
    }
    public int wordLadder(String[] words, String s, String e) {
        // code here
        Set<String> st=new HashSet<>(Arrays.asList(words));
        if(!st.contains(e)){
            return 0;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(s,1));
        st.remove(s);
        while(!q.isEmpty()){
            Node p=q.remove();
            StringBuilder x=new StringBuilder(p.word);
            int v=p.steps;
            for(int i=0;i<x.length();i++){
                char c=x.charAt(i);
                for(int j=0;j<26;j++){
                    x.setCharAt(i,(char)(j+'a'));
                    if(x.toString().equals(e)){
                        return v+1;
                    }
                    if(st.contains(x.toString())){
                        q.add(new Node(x.toString(),v+1));
                        st.remove(x.toString());
                    }
                }
                x.setCharAt(i,c);
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna