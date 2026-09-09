class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> l=new ArrayList<>();
        l.add(nums[0]);
        int x=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>l.get(x)){
                l.add(nums[i]);
                x++;
            }
            else{
                int t=f(l,nums[i]);
                l.set(t,nums[i]);
            }
        }
        return l.size();
    }
    int f(List<Integer> l,int t){
        int s=0;
        int e=l.size()-1;
        int ans=-1;
        while(s<=e){
            int m=(s+e)/2;
            if(l.get(m)>=t){
                ans=m;
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna