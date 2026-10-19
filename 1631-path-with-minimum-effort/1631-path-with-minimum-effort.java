class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        List<List<int[]>> e=new ArrayList<>();
        for(int i=0;i<n*m;i++){
            e.add(new ArrayList<>());
        }
        int[] sd=new int[n*m];
        sd[0]=0;
        for(int i=1;i<n*m;i++){
            sd[i]=Integer.MAX_VALUE;
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i-1>=0){
                    e.get(c).add(new int[]{(i-1)*m+j,Math.abs(heights[i][j]-heights[i-1][j])});
                }
                if(i+1<n){
                    e.get(c).add(new int[]{(i+1)*m+j,Math.abs(heights[i][j]-heights[i+1][j])});
                }
                if(j-1>=0){
                    e.get(c).add(new int[]{i*m+(j-1),Math.abs(heights[i][j]-heights[i][j-1])});
                }
                if(j+1<m){
                    e.get(c).add(new int[]{i*m+(j+1),Math.abs(heights[i][j]-heights[i][j+1])});
                }
                c++;
            }
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,0});
        while(!pq.isEmpty()){
            int[] t=pq.remove();
            int d=t[0];
            int u=t[1];
            for(int[] neigh:e.get(u)){
                int v=neigh[0];
                int wt=neigh[1];
                if(sd[v]>Math.max(d,wt)){
                    sd[v]=Math.max(d,wt);
                    pq.add(new int[]{Math.max(d,wt),v});
                }
            }
        }
        for(int i=0;i<n*m;i++){
            System.out.println(sd[i]);
        }
        return sd[n*m-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna