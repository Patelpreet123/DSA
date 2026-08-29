class Solution {
    public int maxValidSplits(int[] nums) {
        int n=nums.length;
        int m=f(nums);
        for(int i=0;i<n;i++){
            int[] a=new int[n-1];
            int x=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    a[x]=nums[j];
                    x++;
                }
            }
            m=Math.max(m,f(a));
        }
        return m;
    }
    int f(int[] a){
        int m=a.length;
        int[] x1=new int[m];
        x1[0]=a[0];
        int[] x2=new int[m];
        x2[m-1]=a[m-1];
        for(int i=1;i<m;i++){
            x1[i]=gcd(x1[i-1],a[i]);
        }
        for(int i=m-2;i>=0;i--){
            x2[i]=gcd(x2[i+1],a[i]);
        }
        int x=0;
        for(int i=0;i<m-1;i++){
            if(x1[i]==x2[i+1]){
                x++;
            }
        }
        return x;
    }
    int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna