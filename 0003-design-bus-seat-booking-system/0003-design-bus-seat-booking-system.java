class BusBooking {
    int[] x;
    int t,cnt;
    public BusBooking(int n) {
        x=new int[4*(n+1)];
        t=0;
        cnt=0;
    }
    
    public void toggle(String seat) {
        int c=seat.charAt(0)-'A';
        int r=0;
        for(int i=1;i<seat.length();i++){
            r=r*10+(seat.charAt(i)-'0');
        }
        int i=r*4+c;
        if(x[i]>0){
            t-=x[i];
            x[i]=0;
            cnt--;
        }
        else{
            int c1=1;
            if(c==0){
                if(x[r*4+1]>0){
                    c1=3;
                }
            }
            else if(c==3){
                if(x[r*4+2]>0){
                    c1=3;
                }
            }
            x[i]=c1;
            t+=c1;
            cnt++;
        }
    }
    
    public int getTotalTime() {
        return t;
    }
    
    public int getMinTime() {
        return cnt;
    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna