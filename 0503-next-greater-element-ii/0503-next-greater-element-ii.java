class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=nums[i]){
                st.pop();
            }
            st.push(nums[i]);
        }
        int[] x=new int[n];
        int i=n-1;
        while(i>=0){
            while(!st.isEmpty()&&st.peek()<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                x[i]=-1;
            }
            else{
                x[i]=st.peek();
            }
            st.push(nums[i]);
            i--;
        }
        return x;
    }
}