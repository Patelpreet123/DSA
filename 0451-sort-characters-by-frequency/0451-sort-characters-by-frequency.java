class Solution {
    public String frequencySort(String s) {
        int[][] x=new int[62][2];
        for(char c:s.toCharArray()){
            if(c>='a'&&c<='z'){
                x[c-'a'][0]=c;
                x[c-'a'][1]++;
            }
            else if(c>='A'&&c<='Z'){
                x[c-'A'+26][0]=c;
                x[c-'A'+26][1]++;
            }
            else{
                x[c-'0'+52][0]=c;
                x[c-'0'+52][1]++;
            }
        }
        Arrays.sort(x,(a,b)->b[1]-a[1]);
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<62;i++){
            while(x[i][1]!=0){
                s1.append((char)x[i][0]);
                x[i][1]--;
            }
        }
        return s1.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna