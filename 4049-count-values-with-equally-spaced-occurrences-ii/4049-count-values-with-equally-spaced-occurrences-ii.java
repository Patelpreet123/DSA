class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,List<Integer>> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i],new ArrayList<>());
            }
            m.get(nums[i]).add(i);
        }
        int ans=0;
        for(List<Integer> x:m.values()){
            if(x.size()>=3){
                boolean f=true;
                int d=x.get(1)-x.get(0);
                for(int j=2;j<x.size();j++){
                    if(x.get(j)-x.get(j-1)!=d){
                        f=false;
                        break;
                    }
                }
                if(f==true){
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