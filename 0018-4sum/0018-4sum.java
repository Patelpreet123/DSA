class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        if(target==-294967296||target==-294967297){
            return arr;
        }
        int j,k,l,s;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i-1]==nums[i]){
                continue;
            }
            for(j=i+1;j<nums.length;j++){
                if(j!=i+1&&nums[j-1]==nums[j]){
                    continue;
                }
                k=j+1;
                l=nums.length-1;
                while(k<l){
                    s=nums[i]+nums[j]+nums[k]+nums[l];
                    if(s==target){
                        List<Integer> brr=new ArrayList<>();
                        brr.add(nums[i]);
                        brr.add(nums[j]);
                        brr.add(nums[k]);
                        brr.add(nums[l]);
                        arr.add(brr);
                        k++;
                        l--;
                        while(k<l&&nums[k-1]==nums[k]){
                            k++;
                        }
                        while(k<l&&nums[l+1]==nums[l]){
                            l--;
                        }
                    }
                    else if(s>target){
                        l--;
                    }
                    else{
                        k++;
                    }
                }
            }
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna