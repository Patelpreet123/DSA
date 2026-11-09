class NumArray {
    int[] x;
    public NumArray(int[] nums) {
        x=new int[4*nums.length];
        bt(0,0,nums.length-1,nums);
    }
    
    public void update(int index, int val) {
        u(index,val,0,0,x.length/4-1);
    }
    
    public int sumRange(int left, int right) {
        return q(left,right,0,0,x.length/4-1);
    }

    void bt(int i,int l,int r,int[] nums){
        if(l==r){
            x[i]=nums[r];
            return;
        }
        int m=(l+r)/2;
        bt(2*i+1,l,m,nums);
        bt(2*i+2,m+1,r,nums);
        x[i]=x[2*i+1]+x[2*i+2];
    }

    void u(int index,int val,int i,int l,int r){
        if(l==r){
            x[i]=val;
            return;
        }
        int m=(l+r)/2;
        if(index<=m){
            u(index,val,2*i+1,l,m);
        }
        else{
            u(index,val,2*i+2,m+1,r);
        }
        x[i]=x[2*i+1]+x[2*i+2];
    }

    int q(int left,int right,int i,int l,int r){
        if(left>r||right<l){
            return 0;
        }
        if(l>=left&&r<=right){
            return x[i];
        }
        int m=(l+r)/2;
        return q(left,right,2*i+1,l,m)+q(left,right,2*i+2,m+1,r);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna