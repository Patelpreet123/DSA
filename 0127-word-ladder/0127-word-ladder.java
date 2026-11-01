class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s=new HashSet<>(wordList);
        if(!s.contains(endWord)){
            return 0;
        }
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        s.remove(beginWord);
        int x=1;
        while(!q.isEmpty()){
            int n=q.size();
            for(int k=0;k<n;k++){
                StringBuilder s1=new StringBuilder(q.remove());
                for(int i=0;i<s1.length();i++){
                    char c=s1.charAt(i);
                    for(int j=0;j<26;j++){
                        s1.setCharAt(i,(char)(j+'a'));
                        String x1=s1.toString();
                        if(x1.equals(endWord)){
                            return x+1;
                        }
                        if(s.contains(x1)){
                            q.add(x1);
                            s.remove(x1);
                        }
                    }
                    s1.setCharAt(i,c);
                }
            }
            x++;
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna