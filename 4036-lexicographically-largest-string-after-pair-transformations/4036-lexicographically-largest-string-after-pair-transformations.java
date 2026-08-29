class Solution {
    public String[] largestString(int[] nums) {
        String[] a=new String[nums.length];
        int x=(int)Math.pow(2,25);
        for(int i=0;i<nums.length;i++){
            StringBuilder s1=new StringBuilder();
            for(int j=0;j<nums[i]/x;j++){
                s1.append('z');
            }
            int r=nums[i]%x;
            for(int j=24;j>=0;j--){
                int t=(int)Math.pow(2,j);
                if(r>=t){
                    s1.append((char)('a'+j));
                    r=r-t;
                }
            }
            a[i]=s1.toString();
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna