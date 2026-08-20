class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(l1.get(l1.size()-1)>l2.get(l2.size()-1)){
                l1.add(nums[i]);
            }
            else{
                l2.add(nums[i]);
            }
        }
        int[] a=new int[nums.length];
        int x=0;
        for(int i=0;i<l1.size();i++){
            a[x]=l1.get(i);
            x++;
        }
        for(int i=0;i<l2.size();i++){
            a[x]=l2.get(i);
            x++;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna