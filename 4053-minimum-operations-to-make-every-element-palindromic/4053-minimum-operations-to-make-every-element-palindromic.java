class Solution {
    static List<Integer> x1=new ArrayList<>();
    static List<Integer> x2=new ArrayList<>();
    static{
        for(int i=1;i<=10;i++){
            int h=(i+1)/2;
            int st=(int)Math.pow(10,h-1);
            int e=(int)Math.pow(10,h)-1;
            for(int j=st;j<=e;j++){
                String s=String.valueOf(j);
                StringBuilder s1=new StringBuilder(s);
                String s2;
                if(i%2==0){
                    s2=s+s1.reverse().toString();
                }
                else{
                    s2=s+s1.reverse().substring(1);
                }
                long v=Long.parseLong(s2);
                if(v>0&&v<=2000000000L){
                    int v1=(int)v;
                    if(v1%2==0){
                        x1.add(v1);
                    }
                    else{
                        x2.add(v1);
                    }
                }
            }
        }
        Collections.sort(x1);
        Collections.sort(x2);
    }
    public long minOperations(int[] nums) {
        long ans=0;
        for(int x:nums){
            if(x%2==0){
                ans+=f(x,x1);
            }
            else{
                ans+=f(x,x2);
            }
        }
        return ans;
    }
    int f(int t,List<Integer> p){
        int i=Collections.binarySearch(p,t);
        if(i>=0){
            return 0;
        }
        i=-1*(i+1);
        long m=Long.MAX_VALUE;
        if(i<p.size()){
            m=Math.min(m,Math.abs((long)t-p.get(i)));
        }
        if(i-1>=0){
            m=Math.min(m,Math.abs((long)t-p.get(i-1)));
        }
        return (int)(m/2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna