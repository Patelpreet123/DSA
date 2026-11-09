class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] a=new String[26];
        String[] x=s.split(" ");
        if(pattern.length()!=x.length){
            return false;
        }
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            int a1=pattern.charAt(i)-'a';
            if(a[a1]==null){
                if(set.contains(x[i])){
                    return false;
                }
                a[a1]=x[i];
                set.add(x[i]);
            }
            else{
                if(!a[a1].equals(x[i])){
                    return false;
                }
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna