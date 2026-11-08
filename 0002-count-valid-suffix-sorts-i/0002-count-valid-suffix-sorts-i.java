class Solution {
    public int countSuffix(int[] nums, int[] target) {
        int[] x=new int[100001];
        for(int i=0;i<nums.length;i++){
            x[nums[i]]++;
            x[target[i]]--;
        }
        for(int x1:x){
            if(x1!=0){
                return 0;
            }
        }
        int i=0;
        while(i<nums.length&&nums[i]==target[i]){
            i++;
        }
        int j=nums.length-1;
        while(j>0&&target[j-1]>=target[j]){
            j--;
        }
        return Math.max(0,Math.min(i,nums.length-1)-j+1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna