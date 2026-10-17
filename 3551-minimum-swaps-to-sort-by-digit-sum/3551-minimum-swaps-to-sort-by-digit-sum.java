class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            int s=0;
            int t=nums[i];
            while(t!=0){
                s=s+t%10;
                t=t/10;
            }
            a[i]=s;
        }
        int[][] a1=new int[n][3];
        for(int i=0;i<n;i++){
            a1[i][0]=a[i];
            a1[i][1]=i;
            a1[i][2]=nums[i];
        }
        Arrays.sort(a1,(x,y)->{
            if(x[0]!=y[0]){
                return x[0]-y[0];
            }
            else{
                return x[2]-y[2];
            }
        });
        int x=0;
        for(int i=0;i<n;i++){
            if(a1[i][1]==i){
                continue;
            }
            else{
                while(a1[i][1]!=i){
                    int t=a1[i][1];
                    int[] t1=a1[i];
                    a1[i]=a1[t];
                    a1[t]=t1;
                    x++;
                }
            }
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna