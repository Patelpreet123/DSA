class Solution {
    public int kthDigit(long k) {
        if(k<=9){
            return (int)k;
        }
        k=k-9;
        long r=9;
        long d=2;
        long s=1;
        while(true){
            k=k-(r*10*d);
            if(k<=0){
                break;
            }
            r=r*10;
            d++;
            s=s*10;
        }
        k=k+(r*10*d);
        k--;
        long b=k/(d*10);
        b=b+s;
        long m=k%(d*10);
        long x=m/d;
        int i=(int)(m%d);
        if(b%2==0){
            long x1=b*10+x;
            String s1=String.valueOf(x1);
            return s1.charAt(i)-'0';
        }
        else{
            long x1=b*10+(9-x);
            String s1=String.valueOf(x1);
            return s1.charAt(i)-'0';
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna