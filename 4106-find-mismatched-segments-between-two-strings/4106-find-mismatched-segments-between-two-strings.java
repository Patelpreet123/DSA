class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans=new ArrayList<>();
        int n=s1.length();
        int i=0;
        while(i<n){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
                continue;
            }
            int x=i;
            while(i<n&&s1.charAt(i)!=s2.charAt(i)){
                i++;
            }
            List<String> l=new ArrayList<>();
            l.add(s1.substring(x,i));
            l.add(s2.substring(x,i));
            ans.add(l);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna