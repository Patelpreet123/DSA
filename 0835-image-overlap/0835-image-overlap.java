class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        List<int[]> l1=new ArrayList<>();
        List<int[]> l2=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(img1[i][j]==1){
                    l1.add(new int[]{i,j});
                }
                if(img2[i][j]==1){
                    l2.add(new int[]{i,j});
                }
            }
        }
        Map<String,Integer> m=new HashMap<>();
        int mx=0;
        for(int[] x1:l1){
            for(int[] x2:l2){
                int r=x2[0]-x1[0];
                int c=x2[1]-x1[1];
                String s=r+" "+c;
                if(m.containsKey(s)){
                    m.put(s,m.get(s)+1);
                }
                else{
                    m.put(s,1);
                }
                mx=Math.max(mx,m.get(s));
            }
        }
        return mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna