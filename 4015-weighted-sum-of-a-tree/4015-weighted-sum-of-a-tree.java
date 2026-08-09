class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n=parent.length;
        int[] d=new int[n];
        int h=1;
        d[0]=1;
        for(int i=1;i<n;i++){
            int x=i;
            int c=0;
            while(x!=-1&&d[x]==0){
                c++;
                x=parent[x];
            }
            int b=d[x];
            int y=i;
            while(d[y]==0){
                d[y]=b+c;
                if(d[y]>h){
                    h=d[y];
                }
                c--;
                y=parent[y];
            }
        }
        long s=0;
        for(int i=0;i<n;i++){
            s=s+(long)nums[i]*(h+1-d[i]);
        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna