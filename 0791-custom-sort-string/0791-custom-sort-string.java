class Solution {
    public String customSortString(String order, String s) {
        int[] x=new int[26];
        for(char c:s.toCharArray()){
            x[c-'a']++;
        }
        StringBuilder s1=new StringBuilder();
        for(char c:order.toCharArray()){
            while(x[c - 'a']>0){
                s1.append(c);
                x[c-'a']--;
            }
        }
        for(int i=0;i<26;i++){
            while(x[i]>0){
                s1.append((char)(i+'a'));
                x[i]--;
            }
        }
        return s1.toString();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna