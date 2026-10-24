class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] x={0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=1;i<=12;i++){
            x[i]=x[i]+x[i-1];
        }
        int sa=x[Integer.parseInt(arriveAlice.substring(0,2))-1]+Integer.parseInt(arriveAlice.substring(3,5));
        int ea=x[Integer.parseInt(leaveAlice.substring(0,2))-1]+Integer.parseInt(leaveAlice.substring(3,5));
        int sb=x[Integer.parseInt(arriveBob.substring(0,2))-1]+Integer.parseInt(arriveBob.substring(3,5));
        int eb=x[Integer.parseInt(leaveBob.substring(0,2))-1]+Integer.parseInt(leaveBob.substring(3,5));
        int c=0;
        for(int i=1;i<=365;i++){
            if((i>=sa&&i<=ea)&&(i>=sb&&i<=eb)){
                c++;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna