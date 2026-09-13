class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] x=new int[101];
        for(int n:nums){
            x[n]++;
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(x[nums[i]]==3){
                x[nums[i]]=0;
                int l=i;
                int d=0;
                boolean f=false;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==nums[i]){
                        if(d==0){
                            d=j-l;
                            l=j;
                        }
                        else{
                            if(j-l!=d){
                                f=true;
                                break;
                            }
                        }
                    }
                }
                if(f==false){
                    ans++;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna