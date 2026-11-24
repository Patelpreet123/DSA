class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int ans=1;
        int mx=2*2*2*3*3*5*7*10;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int p=1;
                int g=0;
                int l=1;
                boolean x=false;
                for(int k=i;k<=j;k++){
                    p=p*nums[k];
                    if(p>mx){
                        x=true;
                        break;
                    }
                    g=gcd(g,nums[k]);
                    l=lcm(l,nums[k]);
                }
                if(!x&&(p==g*l)){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    int lcm(int a,int b){
        return a/gcd(a,b)*b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna