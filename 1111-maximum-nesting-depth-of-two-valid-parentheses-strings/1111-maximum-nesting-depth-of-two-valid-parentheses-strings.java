class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] x=new int[seq.length()];
        int a=0,b=0;
        for(int i=0;i<seq.length();i++){
            char c=seq.charAt(i);
            if(c=='('){
                if(a<=b){
                    a++;
                    x[i]=0;
                }
                else{
                    b++;
                    x[i]=1;
                }
            }
            else{
                if(a>b){
                    a--;
                    x[i]=0;
                }
                else{
                    b--;
                    x[i]=1;
                }
            }
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna