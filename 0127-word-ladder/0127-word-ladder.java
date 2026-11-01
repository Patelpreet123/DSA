class Solution {
    class Node{
        String s;
        int x;
        Node(String a,int b){
            s=a;
            x=b;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s=new HashSet<>(wordList);
        if(!s.contains(endWord)){
            return 0;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(beginWord,1));
        s.remove(beginWord);
        while(!q.isEmpty()){
            Node t=q.remove();
            StringBuilder s1=new StringBuilder(t.s);
            int v=t.x;
            for(int i=0;i<s1.length();i++){
                char c=s1.charAt(i);
                for(int j=0;j<26;j++){
                    s1.setCharAt(i,(char)(j+'a'));
                    String x1=s1.toString();
                    if(x1.equals(endWord)){
                        return v+1;
                    }
                    if(s.contains(x1)){
                        q.add(new Node(x1,v+1));
                        s.remove(x1);
                    }
                }
                s1.setCharAt(i,c);
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna