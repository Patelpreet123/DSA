class Solution {
    public int maximumGap(String skill, String station) {
        int n=skill.length();
        if(n<=1){
            return 0;
        }
        int m=station.length();
        int[] x=new int[n];
        int i=0;
        for(int j=0;j<n;j++){
            while(station.charAt(i)!=skill.charAt(j)){
                i++;
            }
            x[j]=i;
            i++;
        }
        int[] x1=new int[n];
        i=m-1;
        for(int j=n-1;j>=0;j--){
            while(station.charAt(i)!=skill.charAt(j)){
                i--;
            }
            x1[j]=i;
            i--;
        }
        int mx=0;
        for(i=1;i<n;i++){
            if(x1[i]-x[i-1]>mx){
                mx=x1[i]-x[i-1];
            }
        }
        return mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna